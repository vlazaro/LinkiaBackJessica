package com.linkia.jessica.service;

import java.util.List;
import java.util.Optional;

import com.linkia.jessica.model.Orden;

public interface IOrden {

	public List<Orden> findAll();
	public Optional<Orden> findById(Integer id);
	public Orden saveOrden(Orden orden);
	public void deleteOrden(Orden orden);
	public List<Orden> findOrdenByCliente(Integer clienteid);
	public List<Orden> findOrdenByEstadoAndCliente(String estado,Integer clienteid);
	
	
}
