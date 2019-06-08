package com.linkia.jessica.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linkia.jessica.model.Cliente;
import com.linkia.jessica.repository.ClienteRepository;
import com.linkia.jessica.service.IClienteService;

@Service
public class ClienteService implements IClienteService{

	@Autowired
	ClienteRepository repocliente;
	
	@Override
	public List<Cliente> findAll() {
		
		return (List<Cliente>) repocliente.findAll();
	}

	@Override
	public Optional<Cliente> findById(Integer id) {

		return repocliente.findById(id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cliente> findByName(String nombre) {
		
		return (List<Cliente>) repocliente.findByName(nombre);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cliente> findByApellido(String apellido) {
		
		return (List<Cliente>) repocliente.findByApellido(apellido);
	}

	@Override
	public Cliente saveCliente(Cliente cliente) {
		
		return repocliente.save(cliente);
	}

	@Override
	public void deleteCliente(Cliente cliente) {
		repocliente.delete(cliente);
		
	}

}
