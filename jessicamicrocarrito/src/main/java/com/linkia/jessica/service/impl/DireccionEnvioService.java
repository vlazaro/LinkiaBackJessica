package com.linkia.jessica.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linkia.jessica.model.Direccionenvio;
import com.linkia.jessica.repository.DireccionEnvioRepository;
import com.linkia.jessica.service.IDireccionEnvio;

@Service
public class DireccionEnvioService implements IDireccionEnvio {

	@Autowired
	DireccionEnvioRepository repodireccion;
	
	
	
	@Override
	public List<Direccionenvio> findAll() {
		 return repodireccion.findAll();
	}

	@Override
	public Optional<Direccionenvio> findById(Integer id) {
		return repodireccion.findById(id);
	}

	@Override
	public Direccionenvio saveDireccionEnvio(Direccionenvio direccionenvio) {
		return repodireccion.save(direccionenvio);
	}

	@Override
	public void deleteOrden(Direccionenvio direccionenvio) {
		 repodireccion.delete(direccionenvio);
		
	}

}
