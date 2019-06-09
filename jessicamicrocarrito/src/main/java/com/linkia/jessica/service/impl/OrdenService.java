package com.linkia.jessica.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linkia.jessica.model.Orden;
import com.linkia.jessica.repository.OrdenRepository;
import com.linkia.jessica.service.IOrden;

@Service
public class OrdenService implements IOrden {

	@Autowired
	OrdenRepository ordenRepository;
	
	
	@Override
	public List<Orden> findAll() {
		
		return (List<Orden>) ordenRepository.findAll();
	}

	@Override
	public Optional<Orden> findById(Integer id) {
		return ordenRepository.findById(id);
	}

	@Override
	public Orden saveOrden(Orden orden) {
		return ordenRepository.save(orden);
	}

	@Override
	public void deleteOrden(Orden orden) {
		ordenRepository.delete(orden);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Orden> findOrdenByCliente(Integer clienteid) {
		return (List<Orden>) ordenRepository.findOrdenByCliente(clienteid);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Orden> findOrdenByEstadoAndCliente(String estado, Integer clienteid) {
		return (List<Orden>) ordenRepository.findOrdenByEstadoAndCliente(estado, clienteid);
	}

}
