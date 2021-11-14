package com.cibertec.rest.service;

import java.util.List;

import com.cibertec.rest.entity.Editorial;

public interface EditorialService {

	public abstract List<Editorial> listaEditorial();
	public abstract Editorial insertaEditorial(Editorial obj);
	
}
