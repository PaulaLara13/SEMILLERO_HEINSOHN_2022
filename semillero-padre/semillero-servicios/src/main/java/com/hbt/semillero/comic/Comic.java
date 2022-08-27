package com.hbt.semillero.comic;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.hbt.semillero.enums.EstadoEnum;


/**
 * 
 * <b>Descripción:<b> Clase que mapea los atributos y genrera los getters y setters
 * <b>Caso de Uso:<b> 
 * @author Paula Lara
 * @version
 */
@Entity
@Table(name="COMIC")
public class Comic {
	/**
	 * Anotacion llave primaria y mapeo
	 */
	@Id             
	@Column(name="SCID")
	@SequenceGenerator(allocationSize = 1,name="COMIC_SCID_GENERATOR",sequenceName="SEQ_COMIC")                 
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="COMIC_SCID_GENERATOR")
	private Long id;
	
	/**
	 * Anotacion de columnas y mapeo de cada una de ellas
	 */
	@Column(name="SCNOMBRE")           
	private String nombre;
	
	@Column(name="SCEDITORIAL")
	private String editorial;
	
	@Column(name="SCTEMATICA")
	private String tematica;
	
	@Column(name="SCCOLECCION")
	private String coleccion;

	@Column(name="SCNUMEROPAGINAS")
	private int numeroPaginas;

	@Column(name="SCPRECIO")
	private Long precio;

	@Column(name="SCAUTORES")
	private String autores;
	
	@Column(name="SCCOLOR")
	private Boolean color;
	
	@Column(name="SCFECHA_VENTA")
	private Date fechaVenta;

	@Column(name="SCESTADO")
	private EstadoEnum estado;

	@Column(name="SCCANTIDAD")
	private int cantidad;
	
	public Comic() {                            
	}
	
	/**
	 * Metodo OCnstructor en el cual se inicializan los atributos
	 * @param nombreComic
	 * @param edit
	 * @param tematic
	 * @param coleccion
	 * @param paginas
	 * @param prec
	 * @param autor
	 * @param color
	 * @param fecha
	 * @param estad
	 * @param cantidad
	 */
	public Comic(String nombreComic,String edit,String tematic,String coleccion, int paginas,
			Long prec,String autor,boolean color, Date fecha,EstadoEnum estad, int cantidad) {
	                                       
		this.nombre = nombreComic;
		this.editorial = edit;
		this.tematica = tematic;
		this.coleccion = coleccion;
		this.numeroPaginas = paginas;
		this.precio = prec;
		this.autores = autor;
		this.color = color;
		this.fechaVenta = fecha;
		this.estado = estad;
		this.cantidad = cantidad;
	}

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
	 * @return the tematica
	 */
	public String getTematica() {
		return tematica;
	}

	/**
	 * @param tematica the tematica to set
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
	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	/**
	 * @param numeroPaginas the numeroPaginas to set
	 */
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	/**
	 * @return the precio
	 */
	public Long getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(Long precio) {
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
	public Date getFechaVenta() {
		return fechaVenta;
	}

	/**
	 * @param fechaVenta the fechaVenta to set
	 */
	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	/**
	 * @return the estado
	 */
	public EstadoEnum getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(EstadoEnum estado) {
		this.estado = estado;
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


	@Override
	public String toString() {
		return "Comic [id=" + id + ", nombre=" + nombre + ", editorial=" + editorial + ", tematica=" + tematica
				+ ", coleccion=" + coleccion + ", numeroPaginas=" + numeroPaginas + ", precio=" + precio + ", autores="
				+ autores + ", color=" + color + ", fechaVenta=" + fechaVenta + ", estado=" + estado + ", cantidad="
				+ cantidad + "]";
	}

}
