package com.linkia.jessica.repository;

import java.util.List;
import java.util.concurrent.Future;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import com.linkia.jessica.model.Login;
@Repository
public interface LoginRepository extends CrudRepository<Login, Integer> {

	@Async
	@Query("SELECT c FROM Login c where c.username=:nombre and c.password=:password")
	Future<List<Login>> findByUserPassword(@Param("username") String username, @Param("password") String password);
	
	
}
