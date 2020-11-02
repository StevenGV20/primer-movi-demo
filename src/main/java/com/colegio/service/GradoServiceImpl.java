package com.colegio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colegio.entity.Grado;
import com.colegio.repository.GradoRepository;

@Service
public class GradoServiceImpl implements GradoService{

	@Autowired
	private GradoRepository repository;

	@Override
	public List<Grado> listaGrado() {
		return repository.findAll();
	}

	@Override
	public void eliminaGrado(int id) {
		repository.deleteById(id);
	}

	@Override
	public Optional<Grado> buscaGradoPorId(int id) {
		return repository.findById(id);
	}

	@Override
	public Grado insertaActualizaGrado(Grado obj) {
		return repository.save(obj);
	}
	
	 
}
