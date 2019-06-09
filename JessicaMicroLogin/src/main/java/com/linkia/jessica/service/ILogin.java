package com.linkia.jessica.service;

import java.util.List;
import java.util.Optional;

import com.linkia.jessica.model.Login;

public interface ILogin {

	public List<Login> findAll();
	public Optional<Login> findById(Integer id);
	public List<Login> findByUserPassword(String username,String password);
	public Login saveLogin(Login login);
	public void deleteLogin(Login login);
	
}
