package com.hbt.semillero.rest;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.hbt.semillero.dtos.CompraComicDTO;
import com.hbt.semillero.interfaces.IGestionarCompraComic;

/**
 * Clase que contiene el servicio en el cual se desarrolla la logica para
 * gestionar compra de comics
 * 
 * @author Paula Lara
 *
 */
@Path("/GestionarCompraComicRest") // parte de la ruta del path del rest - url
public class GestionarCompraComicRest {

	@EJB
	private IGestionarCompraComic gestionarCompraComic;

	@POST
	@Path("/realizarCompraComic")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public CompraComicDTO realizarCompraComic(CompraComicDTO compraComicDTO) throws Exception {
		return gestionarCompraComic.realizarCompraComic(compraComicDTO);
	}

}
