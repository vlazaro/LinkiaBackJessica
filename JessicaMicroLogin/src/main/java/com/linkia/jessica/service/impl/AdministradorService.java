package com.linkia.jessica.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linkia.jessica.model.Administrador;
import com.linkia.jessica.model.Cliente;
import com.linkia.jessica.repository.AdministradorRepository;
import com.linkia.jessica.service.IAdministrador;


@Service
public class AdministradorService implements IAdministrador {

	@Autowired
	AdministradorRepository repoadministrador;
	
	@Override
	public List<Administrador> findAll() {
		return (List<Administrador>) repoadministrador.findAll();
	}

	@Override
	public Optional<Administrador> findById(Integer id) {
		return repoadministrador.findById(id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Administrador> findByUserPassword(String username, String password) {
		return (List<Administrador>) repoadministrador.findByUserPassword(username, password);
	}

	@Override
	public Administrador saveAdministrador(Administrador administrador) {
		return repoadministrador.save(administrador);
	}

	@Override
	public void deleteAdministrador(Administrador administrador) {
		repoadministrador.delete(administrador);

	}

}
