package com.linkia.jessica.service;

import java.util.List;
import java.util.Optional;

import com.linkia.jessica.model.Categoria;

public interface ICategoria {

	public List<Categoria> findAll();
	public Optional<Categoria> findById(Integer id);
	public List<Categoria> findByName(String nombre);
	public Categoria saveCategoria(Categoria categoria);
	public void deleteCategoria(Categoria categoria);
	
}
