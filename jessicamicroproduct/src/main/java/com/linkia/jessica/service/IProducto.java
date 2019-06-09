package com.linkia.jessica.service;

import java.util.List;
import java.util.Optional;

import com.linkia.jessica.model.Producto;

public interface IProducto {

	public List<Producto> findAll();
	public Optional<Producto> findById(Integer id);
	public List<Producto> findByName(String nombre);
	public Producto saveProducto(Producto producto);
	public void deleteProducto(Producto producto);
	
}
