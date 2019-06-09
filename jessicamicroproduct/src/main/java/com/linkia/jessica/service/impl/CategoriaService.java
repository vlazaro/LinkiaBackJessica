package com.linkia.jessica.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linkia.jessica.model.Categoria;
import com.linkia.jessica.repository.CategoriaRepository;
import com.linkia.jessica.service.ICategoria;

@Service
public class CategoriaService implements ICategoria {

	@Autowired
	CategoriaRepository categoriaRepository;

	@Override
	public List<Categoria> findAll() {
		return (List<Categoria>) categoriaRepository.findAll();
	}

	@Override
	public Optional<Categoria> findById(Integer id) {
		return categoriaRepository.findById(id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Categoria> findByName(String nombre) {
		return (List<Categoria>) categoriaRepository.findByName(nombre);
	}

	@Override
	public Categoria saveCategoria(Categoria producto) {
		return categoriaRepository.save(producto);
	}

	@Override
	public void deleteCategoria(Categoria producto) {
		categoriaRepository.delete(producto);

	}
}
