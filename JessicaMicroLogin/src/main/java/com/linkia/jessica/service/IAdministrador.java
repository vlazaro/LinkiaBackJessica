package com.linkia.jessica.service;

import java.util.List;
import java.util.Optional;

import com.linkia.jessica.model.Administrador;

public interface IAdministrador {

	public List<Administrador> findAll();
	public Optional<Administrador> findById(Integer id);
	public List<Administrador> findByUserPassword(String username,String password);
	public Administrador saveAdministrador(Administrador administrador);
	public void deleteAdministrador(Administrador administrador);
	
	
}
