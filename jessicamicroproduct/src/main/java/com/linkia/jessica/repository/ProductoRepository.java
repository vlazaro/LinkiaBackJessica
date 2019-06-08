package com.linkia.jessica.repository;

import java.util.List;
import java.util.concurrent.Future;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import com.linkia.jessica.model.Producto;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Integer> {

	@Async
	@Query("SELECT p FROM Producto p where LOWER(p.nombre)=LOWER(:nombre)")
	Future<List<Producto>> findByName(@Param("nombre") String nombre);
	
	
	@Async
	@Query("SELECT p FROM Producto p where p.categoria_id =:categoria")
	Future<List<Producto>> findByCategoria(@Param("categoria_id") Integer categoria);
	
	
	
	
	
}
