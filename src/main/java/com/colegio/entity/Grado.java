package com.colegio.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "grado")
public class Grado {

	@Id
	@Column(name="idGrado")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idGrado;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="estado")
	private String estado;
	
}




