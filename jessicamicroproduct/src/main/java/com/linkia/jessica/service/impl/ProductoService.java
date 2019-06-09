package com.linkia.jessica.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linkia.jessica.model.Cliente;
import com.linkia.jessica.model.Producto;
import com.linkia.jessica.repository.ProductoRepository;
import com.linkia.jessica.service.IProducto;

@Service
public class ProductoService implements IProducto{

	@Autowired
	ProductoRepository productRepository;
	
	@Override
	public List<Producto> findAll() {
		return (List<Producto>) productRepository.findAll();
	}

	@Override
	public Optional<Producto> findById(Integer id) {
		return productRepository.findById(id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Producto> findByName(String nombre) {
		return (List<Producto>) productRepository.findByName(nombre);
	}

	@Override
	public Producto saveProducto(Producto producto) {
		return productRepository.save(producto);
	}

	@Override
	public void deleteProducto(Producto producto) {
		productRepository.delete(producto);
		
	}

}
