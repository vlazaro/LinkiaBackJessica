package com.linkia.jessica.service;

import java.util.List;
import java.util.Optional;

import com.linkia.jessica.model.Direccionenvio;

public interface IDireccionEnvio {
	
	public List<Direccionenvio> findAll();
	public Optional<Direccionenvio> findById(Integer id);
	public Direccionenvio saveDireccionEnvio(Direccionenvio direccionenvio);
	public void deleteDireccionEnvio(Direccionenvio direccionenvio);
}
