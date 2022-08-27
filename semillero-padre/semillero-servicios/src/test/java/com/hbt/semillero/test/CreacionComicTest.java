package com.hbt.semillero.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.hbt.semillero.comic.Comic;
import com.hbt.semillero.enums.EstadoEnum;

public class CreacionComicTest {

	private List<Comic> listaComics;

	/**
	 * 
	 * <b>Descripción:<b> Metodo para creacion de comics con respectivoss atributos
	 * 
	 * @author Paula Lara
	 * @version
	 */
	@BeforeEach
	public void inicializar() {
		BasicConfigurator.configure();
		/**
		 * <b>Descripción:<b> Creacion de comics apartir del constructor
		 */
		
		Comic batman = new Comic("Batman", "DCCOMICS", "CIENCIA_FICCION", "BATMAN_1", 140, 30000L, "Luis_Vergara",
				false, new Date(2022, 10, 20), EstadoEnum.ACTIVO, 15);
		Comic daredevil = new Comic("Daredevil", "marvel", "CIENCIA_FICCION", "marvel", 500, 15000L, "luisa_Bermudez",
				true, new Date(1995, 11, 02), EstadoEnum.INACTIVO, 5);
		Comic Born_Again = new Comic("Born_Again", "LOSCORS", "AVENTURAS", "miedovol1", 500, 15000L, "Carlos_Murcia",
				true, new Date(1991, 05, 07), EstadoEnum.INACTIVO, 3);
		Comic hulk = new Comic("Hulk", "marvel", "CIENCIA_FICCION", "marvel", 871, 15000L, "Carolina_Picoro", false,
				new Date(1991, 05, 07), EstadoEnum.ACTIVO, 8);
		Comic mujer_maravilla = new Comic("Mujer_Maravilla", "marvel", "CIENCIA_FICCION", "marvel", 142, 25000L,
				"Karen_Agudelo", true, new Date(1991, 05, 07), EstadoEnum.ACTIVO, 1);

		/**
		 * <b>Descripción:<b> Creacion de comics apartir del metodo de acceso set
		 */
		Comic superMan = new Comic();
		superMan.setNombre("Super Man");
		superMan.setEditorial("DCCOMICS");
		superMan.setTematica("CIENCIA_FICCION");
		superMan.setColeccion("supermanvol4");
		superMan.setNumeroPaginas(150);
		superMan.setPrecio(78000L);
		superMan.setAutores("Clementina");
		superMan.setColor(false);
		superMan.setEstado(EstadoEnum.INACTIVO);
		superMan.setCantidad(1);

		Comic ironMan = new Comic();
		ironMan.setNombre("Iron Man");
		ironMan.setEditorial("Marvel");
		ironMan.setTematica("CIENCIA_FICCION");
		ironMan.setColeccion("superHeroes");
		ironMan.setNumeroPaginas(654);
		ironMan.setPrecio(15000L);
		ironMan.setAutores("Clementina");
		ironMan.setColor(false);
		ironMan.setEstado(EstadoEnum.ACTIVO);
		ironMan.setCantidad(78);

		Comic sanoman = new Comic();
		sanoman.setNombre("Sanoman");
		sanoman.setEditorial("liberacion");
		sanoman.setTematica("FANTASTICO");
		sanoman.setColeccion("superHeroes");
		sanoman.setNumeroPaginas(754);
		sanoman.setPrecio(96000L);
		sanoman.setAutores("Rosa_Mendez");
		sanoman.setColor(true);
		sanoman.setEstado(EstadoEnum.INACTIVO);
		sanoman.setCantidad(15);

		Comic vendetta = new Comic();
		vendetta.setNombre("Vendeta");
		vendetta.setEditorial("Carnabaca");
		vendetta.setTematica("BELICO");
		vendetta.setColeccion("superHeroes");
		vendetta.setNumeroPaginas(800);
		vendetta.setPrecio(52000L);
		vendetta.setAutores("Sebastian_Cubides");
		vendetta.setColor(false);
		vendetta.setEstado(EstadoEnum.INACTIVO);
		vendetta.setCantidad(7);

		Comic flash = new Comic();
		flash.setNombre("Flash");
		vendetta.setEditorial("DCCOMICS");
		vendetta.setTematica("CIENCIA_FICCION");
		vendetta.setColeccion("superHeroes");
		flash.setNumeroPaginas(360);
		vendetta.setPrecio(17200L);
		vendetta.setAutores("Sebastian_Cubides");
		vendetta.setColor(true);
		flash.setEstado(EstadoEnum.INACTIVO);
		vendetta.setCantidad(7);

		this.listaComics = new ArrayList<>();
		this.listaComics.add(batman);
		this.listaComics.add(daredevil);
		this.listaComics.add(Born_Again);
		this.listaComics.add(hulk);
		this.listaComics.add(mujer_maravilla);
		this.listaComics.add(superMan);
		this.listaComics.add(ironMan);
		this.listaComics.add(sanoman);
		this.listaComics.add(vendetta);
		this.listaComics.add(flash);
	}

	/**
	 * Metodo que recorre una lista de comics e identifica cuales estan activos
	 * @param comics lista de comics
	 * @return lista de comics activos
	 */
	private List<Comic> comicActivo(List<Comic> comics) {
		List<Comic> comicsActivos = new ArrayList<>();
		for (Comic comicAct : comics) {
			if (comicAct.getEstado().equals(EstadoEnum.ACTIVO)) {
				comicsActivos.add(comicAct);
			}
		}
		return comicsActivos;

	}

	/**
	 *  Metodo que recorre una lista de comics e identifica cuales estan inactivos
	 * @param comics lista de comics
	 * @return lista de los comics inactivos
	 */
	private List<Comic> comicInactivo(List<Comic> comics) {
		List<Comic> comicsInactivos = new ArrayList<>();
		for (Comic comicInac : comics) {
			if (comicInac.getEstado().equals(EstadoEnum.INACTIVO)) {
				comicsInactivos.add(comicInac);
			}
		}
		return comicsInactivos;

	}
	
	/**
	 * Excepcion que devolvera el mensaje esperado 
	 * @throws Exception 
	 */
	private void comicException() throws Exception {
		List<Comic> listaInac= comicInactivo(listaComics);
		throw new Exception("Se ha detectado que de " + this.listaComics.size() + " comics se encontraron que " +
		comicActivo(listaComics).size() + "  se encuentran activos y " + listaInac.size() +
		" inactivos. Los comics inactivos son: " + nombresComics(listaInac));   
	}

	/**
	 * Metodo que recorre la lista de comics
	 * @param comics
	 * @return nombres de comics Inactivos
	 */
	private String nombresComics(List<Comic> comics) {
		String nombres = "";
		for (Comic comic : comics) {
			nombres= nombres+comic.getNombre()+" ";
		}
		return nombres;
	}
	

	/**
	 * Test que valida que el metodo para identificar activos funcione de la manera esperada, devolviendo comics con estado activo
	 * @throws Exception
	 */
	@Test
	public void validarActivos() throws Exception {
		List<Comic> mostrarActivos = comicActivo(this.listaComics);
		for (Comic comic : mostrarActivos) {
			System.out.println(comic.toString());
			assertEquals(EstadoEnum.ACTIVO, comic.getEstado());
		}
	}
	
	/**
	 * Test para validar y capturar el error 
	 */
	@Test
	public void pruebaFallida() {       
		Exception excepcion = assertThrows(Exception.class, () -> {                     
			comicException();
		});
		assertNotNull(excepcion);   //excepcion nula
		System.out.println(excepcion.getMessage());
	}



}
