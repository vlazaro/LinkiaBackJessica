package com.linkia.jessica.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linkia.jessica.model.Administrador;
import com.linkia.jessica.model.Login;
import com.linkia.jessica.repository.LoginRepository;
import com.linkia.jessica.service.ILogin;


@Service
public class LoginServiceImpl implements ILogin {

	
	@Autowired
	LoginRepository loginRepo;
	
	@Override
	public List<Login> findAll() {
		return (List<Login>) loginRepo.findAll();
	}

	@Override
	public Optional<Login> findById(Integer id) {
		return loginRepo.findById(id);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Login> findByUserPassword(String username, String password) {
		return (List<Login>) loginRepo.findByUserPassword(username, password);
	}

	@Override
	public Login saveLogin(Login login) {
		return loginRepo.save(login);
	}

	@Override
	public void deleteLogin(Login login) {
		loginRepo.delete(login);

	}

}
