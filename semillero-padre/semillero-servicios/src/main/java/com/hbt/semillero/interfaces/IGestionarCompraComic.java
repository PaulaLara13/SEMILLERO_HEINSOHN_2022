package com.hbt.semillero.interfaces;

import javax.ejb.Local;

import com.hbt.semillero.dtos.CompraComicDTO;

@Local
public interface IGestionarCompraComic {

	public CompraComicDTO realizarCompraComic(CompraComicDTO compraComicDTO);
}
