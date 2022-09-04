package com.hbt.semillero.interfaces;

import javax.ejb.Local;

import com.hbt.semillero.dtos.ConsultarComicTamanioNombreDTO;

@Local
public interface IConsultarComicTamanioNombre {
	/**
	 * 
	 * @param lengthComic trae los nombres de los comics
	 * @return
	 * @throws Exception
	 */
	public ConsultarComicTamanioNombreDTO consultarComicTamanioNombre(short lengthComic);

}
