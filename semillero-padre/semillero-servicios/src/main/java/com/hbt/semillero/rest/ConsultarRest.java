package com.hbt.semillero.rest;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.hbt.semillero.dtos.ConsultarComicTamanioNombreDTO;
import com.hbt.semillero.interfaces.IConsultarComicTamanioNombre;

/**
 * Clase que contiene el servicio en el cual se desarrolla la logica para
 * consultar una lista de comics
 * 
 * @author Paula Lara
 *
 */
@Path("/ConsultarRest") // parte de la ruta del path del rest - url
public class ConsultarRest {
	@EJB // inyecta el bean
	private IConsultarComicTamanioNombre consultarComicTamanioNombreL; // se inyecta la interfaz de la consulta

	/**
	 * Metodo que recibira el parametro y capturar los nombres
	 * 
	 * @param lengthComic parametro para traer todos los nombres de los comics
	 * @return la consulta de los nombres de los comics
	 * @throws Exception
	 */
	@GET
	@Path("/consultarComicTamanioNombre/{lengthComic}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ConsultarComicTamanioNombreDTO consultarComicTamanioNombre(@PathParam("lengthComic") short lengthComic)
			throws Exception {
		return this.consultarComicTamanioNombreL.consultarComicTamanioNombre(lengthComic);

	}
}
