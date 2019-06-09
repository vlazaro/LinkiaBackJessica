package com.linkia.jessica.repository;

import java.util.List;
import java.util.concurrent.Future;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;


import com.linkia.jessica.model.Orden;

@Repository
public interface OrdenRepository extends CrudRepository<Orden,Integer> {

	@Async
	@Query("SELECT c FROM Orden c where c.cliente_id=:clienteid)")
	Future<List<Orden>> findOrdenByCliente(@Param("clienteid") Integer clienteid);
	
	
	@Async
	@Query("SELECT c FROM Orden c where c.estado=:estado and c.cliente_id=:clienteid)")
	Future<List<Orden>> findOrdenByEstadoAndCliente(@Param("estado") String estado,@Param("clienteid") Integer clienteid);
	
	
	
	
}
