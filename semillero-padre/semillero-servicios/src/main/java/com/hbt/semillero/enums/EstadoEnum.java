package com.hbt.semillero.enums;

public enum EstadoEnum {
	/**
	 * asignacion de valor a los estados
	 */
	ACTIVO("enum.estado.activo"),
	INACTIVO("enum.estado.inactivo")
	;
	
	private String estado;
	
	EstadoEnum(String estado){
		this.estado = estado;
	}
	public String getEstado() {
		return estado;
	}

	
}
