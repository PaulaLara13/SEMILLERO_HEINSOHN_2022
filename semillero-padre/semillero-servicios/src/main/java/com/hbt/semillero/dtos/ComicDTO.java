package com.hbt.semillero.dtos;

import com.hbt.semillero.enums.EstadoEnum;

public class ComicDTO {

	private EstadoEnum estadoEnum;

	private Integer cantidad;

	/**
	 * @return the estadoEnum
	 */
	public EstadoEnum getEstadoEnum() {
		return estadoEnum;
	}

	/**
	 * @param estadoEnum the estadoEnum to set
	 */
	public void setEstadoEnum(EstadoEnum estadoEnum) {
		this.estadoEnum = estadoEnum;
	}

	/**
	 * @return the cantidad
	 */
	public Integer getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public ComicDTO(EstadoEnum estadoEnum, Integer cantidad) {
		super();
		this.estadoEnum = estadoEnum;
		this.cantidad = cantidad;
	}

}
