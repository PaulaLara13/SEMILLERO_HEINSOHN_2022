package com.hbt.semillero.dtos;

public class CompraComicDTO {

	private Long idComic;

	private int cantidad;

	private Boolean exitoso;

	private String mensajeEjecucion;

	/**
	 * @return the idComic
	 */
	public Long getIdComic() {
		return idComic;
	}

	/**
	 * @param idComic the idComic to set
	 */
	public void setIdComic(Long idComic) {
		this.idComic = idComic;
	}

	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

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

}
