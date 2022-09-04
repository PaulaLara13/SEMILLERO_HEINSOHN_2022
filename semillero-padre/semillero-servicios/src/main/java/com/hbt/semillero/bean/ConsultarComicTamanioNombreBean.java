package com.hbt.semillero.bean;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.hbt.semillero.dtos.ConsultarComicTamanioNombreDTO;
import com.hbt.semillero.interfaces.IConsultarComicTamanioNombre;

@Stateless // n0o se manejan estados
@TransactionManagement(TransactionManagementType.CONTAINER) // gestiona de manera automatica
public class ConsultarComicTamanioNombreBean implements IConsultarComicTamanioNombre {
	// se inyecta el EntityManager
	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	/**
	 * metodo en el que se realiza la excepcion y consulta de los nombre y los
	 * captura en dos listas en la cual nos va retornar en una losque superan su
	 * longitud en el nombre y la otras las que no superan la logintud, con excepcion 
	 * de proceso exitoso presentado error tecnico
	 */

	public ConsultarComicTamanioNombreDTO consultarComicTamanioNombre(short lengthComic) {

		ConsultarComicTamanioNombreDTO dto = new ConsultarComicTamanioNombreDTO();
		String consultarComicTamanioNombre = "SELECT c.nombre FROM Comic c ";
		try {
			/**
			 * excepcion para controlar la longitud maxima
			 */
			if (lengthComic > 30) {
				throw new Exception("La longitud máxima permitida es de " + 30 + " caracteres ");
			}
			Query queryconsultarComicTamanioNombre = em.createQuery(consultarComicTamanioNombre);
			List<String> dtoList = queryconsultarComicTamanioNombre.getResultList();
			List<String> listaSuperar = new ArrayList<>();
			List<String> listaNoSuperar = new ArrayList<>();
			for (String nombre : dtoList) {
				if (nombre.toCharArray().length >= lengthComic) {
					listaSuperar.add(nombre);
				} else {
					listaNoSuperar.add(nombre);
				}
			}
			dto.setExitoso(true);
			dto.setMensajeEjecucion("Comic procesados exitosamente");
			dto.setNombresMayores(listaSuperar);
			dto.setNombresNoMayores(listaNoSuperar);
		} catch (Exception e) {
			System.out.println("Se ha presentado un error tecnico " + e.getMessage());
			dto.setMensajeEjecucion(e.getMessage());
		}
		return dto;
	}

}
