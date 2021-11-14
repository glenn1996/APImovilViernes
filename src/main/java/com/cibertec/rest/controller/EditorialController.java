package com.cibertec.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.rest.entity.Editorial;
import com.cibertec.rest.service.EditorialService;

@RestController
@RequestMapping("/servicio/editorial")
public class EditorialController {

	@Autowired
	private EditorialService service;

	@GetMapping
	public ResponseEntity<List<Editorial>> listaEditorial(){
		return ResponseEntity.ok(service.listaEditorial());
	}
	

}


