package com.cibertec.rest.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter 
@Table(name = "editorial")
@Entity
public class Editorial {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEditorial;
	private String nombre;
	private String direccion;
	private String pais;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd") 
	private Date fechaCreacion;
	
}
