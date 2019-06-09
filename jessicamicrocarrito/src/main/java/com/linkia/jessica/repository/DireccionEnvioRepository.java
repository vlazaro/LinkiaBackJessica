package com.linkia.jessica.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.linkia.jessica.model.Direccionenvio;
import com.linkia.jessica.model.Direccionenvio;



@Repository
public interface DireccionEnvioRepository extends CrudRepository<Direccionenvio,Integer> {

	public List<Direccionenvio> findAll();
	public Optional<Direccionenvio> findById(Integer id);
	public Direccionenvio saveDireccionEnvio(Direccionenvio orden);
	public void deleteDireccionEnvio(Direccionenvio orden);
	
	
}
