package com.hbt.semillero.dtos;

import java.io.Serializable;
import java.util.List;

public class ConsultarComicTamanioNombreDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
 
	private String nombre;
	/**
	 * atributos de tipo listas para obtener los nombres de los comics y medir longitud
	 */
	private List<String> nombresMayores;
	private List<String> nombresNoMayores;
	/**
	 * atributos que determinan respuestas de servicios 
	 */
	private Boolean exitoso; 
	private String mensajeEjecucion;
	/**
	 * @return the exitoso
	 */
	public Boolean getExitoso() {
		return exitoso;
	}

	/**
	 * @param exitoso the exitoso to set
	 */
	public void setExitoso(Boolean exitoso) {
		this.exitoso = exitoso;
	}

	/**
	 * @return the mensajeEjecucion
	 */
	public String getMensajeEjecucion() {
		return mensajeEjecucion;
	}

	/**
	 * @param mensajeEjecucion the mensajeEjecucion to set
	 */
	public void setMensajeEjecucion(String mensajeEjecucion) {
		this.mensajeEjecucion = mensajeEjecucion;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	/**
	 * @return the nombre
	 */
	public List<String> getNombresMayores() {
		return nombresMayores;
	}

	/**
	 * @param nombre the nombres to set
	 */
	public void setNombresMayores(List<String> nombresMayores) {
		this.nombresMayores = nombresMayores;
	}

	/**
	 * @return the nombre
	 */
	public List<String> getNombresNoMayores() {
		return nombresNoMayores;
	}

	/**
	 * @param nombre the nombres to set
	 */
	public void setNombresNoMayores(List<String> nombresNoMayores) {
		this.nombresNoMayores = nombresNoMayores;
	}

}
