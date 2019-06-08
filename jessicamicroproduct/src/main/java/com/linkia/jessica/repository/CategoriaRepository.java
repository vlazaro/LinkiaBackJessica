package com.linkia.jessica.repository;

import java.util.List;
import java.util.concurrent.Future;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import com.linkia.jessica.model.Categoria;


@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Integer> {

	@Async
	@Query("SELECT c FROM Categoria c where LOWER(c.nombre)=LOWER(:nombre)")
	Future<List<Categoria>> findProducByCategoria(@Param("nombre") String nombre);
	
	
}
