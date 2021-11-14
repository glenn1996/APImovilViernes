package com.cibertec.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.rest.entity.Editorial;
import com.cibertec.rest.repository.EditorialRepository;

@Service
public class EditorialServiceImpl implements EditorialService{

	@Autowired
	private EditorialRepository repository;
	
	@Override
	public List<Editorial> listaEditorial() {
		return repository.findAll();
	}

	@Override
	public Editorial insertaEditorial(Editorial obj) {
		return repository.save(obj);
	}
	

}
