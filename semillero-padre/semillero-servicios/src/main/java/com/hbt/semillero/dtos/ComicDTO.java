package com.hbt.semillero.dtos;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ComicDTO {

	private Long id;

	private String nombre;

	private String editorial;

	private String tematica;

	private String coleccion;

	private Integer numeroPaginas;

	private BigDecimal precio;

	private String autores;

	private Boolean color;

	private LocalDate fechaVenta;

	private String estado;

	private Long cantidad;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
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
	 * @return the editorial
	 */
	public String getEditorial() {
		return editorial;
	}

	/**
	 * @param editorial the editorial to set
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	/**
	 * @return the tematicaEnum
	 */
	public String getTematica() {
		return tematica;
	}

	/**
	 * @param tematicaEnum the tematicaEnum to set
	 */
	public void setTematica(String tematica) {
		this.tematica = tematica;
	}

	/**
	 * @return the coleccion
	 */
	public String getColeccion() {
		return coleccion;
	}

	/**
	 * @param coleccion the coleccion to set
	 */
	public void setColeccion(String coleccion) {
		this.coleccion = coleccion;
	}

	/**
	 * @return the numeroPaginas
	 */
	public Integer getNumeroPaginas() {
		return numeroPaginas;
	}

	/**
	 * @param numeroPaginas the numeroPaginas to set
	 */
	public void setNumeroPaginas(Integer numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	/**
	 * @return the precio
	 */
	public BigDecimal getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	/**
	 * @return the autores
	 */
	public String getAutores() {
		return autores;
	}

	/**
	 * @param autores the autores to set
	 */
	public void setAutores(String autores) {
		this.autores = autores;
	}

	/**
	 * @return the color
	 */
	public Boolean getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(Boolean color) {
		this.color = color;
	}

	/**
	 * @return the fechaVenta
	 */
	public LocalDate getFechaVenta() {
		return fechaVenta;
	}

	/**
	 * @param fechaVenta the fechaVenta to set
	 */
	public void setFechaVenta(LocalDate fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	/**
	 * @return the estadoEnum
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @param estadoEnum the estadoEnum to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * @return the cantidad
	 */
	public Long getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}

	public ComicDTO(Long id, String nombre, String editorial, String tematica, String coleccion, Integer numeroPaginas,
			BigDecimal precio, String autores, Boolean color, LocalDate fechaVenta, String estado, Long cantidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.editorial = editorial;
		this.tematica = tematica;
		this.coleccion = coleccion;
		this.numeroPaginas = numeroPaginas;
		this.precio = precio;
		this.autores = autores;
		this.color = color;
		this.fechaVenta = fechaVenta;
		this.estado = estado;
		this.cantidad = cantidad;
	}

}
