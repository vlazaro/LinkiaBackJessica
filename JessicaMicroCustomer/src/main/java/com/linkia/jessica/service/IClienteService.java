package com.linkia.jessica.service;

import java.util.List;
import java.util.Optional;

import com.linkia.jessica.model.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();
	public Optional<Cliente> findById(Integer id);
	public List<Cliente> findByName(String nombre);
	public List<Cliente> findByApellido(String apellido);
	public Cliente saveCliente(Cliente cliente);
	public void deleteCliente(Cliente cliente);
	

}
