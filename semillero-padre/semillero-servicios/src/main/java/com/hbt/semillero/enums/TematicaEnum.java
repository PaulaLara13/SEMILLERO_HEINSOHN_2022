package com.hbt.semillero.enums;


/**
 * 
 * <b>Descripción:<b> Clase que determina la enumeracion con anotacion para poder leer el enumerador correctamente
 * <b>Caso de Uso:<b> 
 * @author Paula Lara
 * @version
 */
public enum TematicaEnum {
	//valores en el checkconstrain de la base de datos
	AVENTURAS("enum.tematica.aventuras"),       
	BELICO("enum.tematica.belico"),
	HUMORISTICO("enum.tematica.humoristico"),
	DEPORTIVO("enum.tematica.deportivo"),
	FANTASTICO("enum.tematica.fantastico"),
	CIENCIA_FICCION("enum.tematica.cienciaFiccion"),
	HISTORICO("enum.tematica.historico"),
	HORROR("enum.tematica.horror")
	;
	
	private String etiqueta; //propiedad traducido en angular 
	
	TematicaEnum(String etiqueta) {    //constructor de tipo string 
		this.etiqueta = etiqueta;
	}
	
	public String getEtiqueta() {   //json-porpretis en angular lo toma "enum.tematica.aventuras" : "Aventuras" <- lo traduce en el html - etiqueta label
		return etiqueta;
	}

}
