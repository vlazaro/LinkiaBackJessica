package com.linkia.jessica.repository;

import java.util.List;
import java.util.concurrent.Future;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import com.linkia.jessica.model.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente,Integer> {

	@Async
	@Query("SELECT c FROM Cliente c where LOWER(c.nombre)=LOWER(:nombre)")
	Future<List<Cliente>> findByName(@Param("nombre") String nombre);
	
	
	@Async
	@Query("SELECT c FROM Cliente c where LOWER(c.apellido)=LOWER(:apellido)")
	Future<List<Cliente>> findByApellido(@Param("apellido") String apellido);
	
	
	
}
