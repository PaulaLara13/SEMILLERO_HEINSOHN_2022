package com.hbt.semillero.bean;

import java.sql.Date;
import java.time.LocalDate;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.log4j.Logger;

import com.hbt.semillero.comic.Comic;
import com.hbt.semillero.dtos.ComicDTO;
import com.hbt.semillero.dtos.CompraComicDTO;
import com.hbt.semillero.enums.EstadoEnum;
import com.hbt.semillero.interfaces.IGestionarCompraComic;

@Stateless // n0o se manejan estados
@TransactionManagement(TransactionManagementType.CONTAINER) // gestiona de manera automatica
public class GestionarCompraComicBean implements IGestionarCompraComic {

	/* posible error que podria ocasionar */
	private final static Logger LOGGER = Logger.getLogger(GestionarCompraComicBean.class); // volver a inspeccionar los
																							// logs
																							// que le pertencen a la
																							// clase

	/* inyectar el entetyManager */
	@PersistenceContext
	private EntityManager em;

	@Override
	@SuppressWarnings("unchecked")
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public CompraComicDTO realizarCompraComic(CompraComicDTO compraComicDTO) {
		String consultaComicCompra = "SELECT new com.hbt.semillero.dtos.ComicDTO(estado, cantidad) FROM Comic WHERE id = :idComic ";
		try {
			Comic comicConsultadoEntidad = new Comic();

			Query queryConsultaComicCompra = em.createQuery(consultaComicCompra);
			queryConsultaComicCompra.setParameter("idComic", compraComicDTO.getIdComic());
			ComicDTO comicConsultado = (ComicDTO) queryConsultaComicCompra.getSingleResult();

			int resultadoCantidad = comicConsultado.getCantidad() - compraComicDTO.getCantidad();
			if (comicConsultado.getEstadoEnum() == EstadoEnum.INACTIVO) {
				throw new Exception("El comic seleccionado no cuenta con stock en bodega");
			} else if (resultadoCantidad < 0) {
				throw new Exception("La cantidad existente del comic es: " + comicConsultadoEntidad.getCantidad()
						+ ", y supera la ingresada");
			} else {
				if (resultadoCantidad == 0) {
					comicConsultadoEntidad.setCantidad(0);
					comicConsultadoEntidad.setEstado(EstadoEnum.INACTIVO);
				} else {
					comicConsultadoEntidad.setCantidad(resultadoCantidad);
				}
				long miliseconds = System.currentTimeMillis();
				Date date = new Date(miliseconds);
				comicConsultadoEntidad.setFechaVenta(date);
				em.persist(comicConsultadoEntidad);
				compraComicDTO.setExitoso(true);
				compraComicDTO.setMensajeEjecucion(
						"La compra del comic " + comicConsultadoEntidad.getNombre() + " fue exitosa");
			}
		} catch (NonUniqueResultException nure) {
			LOGGER.info("Se ha presentado NonUniqueResultException: " + nure.getMessage());
			compraComicDTO.setExitoso(false);
			compraComicDTO
					.setMensajeEjecucion("Existen registros duplicados para el id " + compraComicDTO.getIdComic());
		} catch (NoResultException nre) {
			LOGGER.info("Se ha presentado NoResultException: " + nre.getMessage());
			compraComicDTO.setExitoso(false);
			compraComicDTO
					.setMensajeEjecucion("No existen registros para el comic con id " + compraComicDTO.getIdComic());
		} catch (Exception e) {
			compraComicDTO.setExitoso(false);
			compraComicDTO.setMensajeEjecucion("Se ha presentado un error tecnico " + e.getMessage());
			LOGGER.info("Se ha presentado un error tecnico " + e.getMessage());
		}
		return compraComicDTO;
	}

}
