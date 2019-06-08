package com.linkia.jessica.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.linkia.jessica.model.Cliente;
import com.linkia.jessica.service.impl.ClienteService;

@RefreshScope
@RestController
public class CustomerController {
	
	
	@Autowired
	ClienteService clienteService;
	
	@RequestMapping(value="/cliente/find/{id}",method=RequestMethod.GET,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public Optional<Cliente> findById(@PathVariable Integer id){
		return clienteService.findById(id);
	}
	
	@RequestMapping(value="/cliente/findall",method=RequestMethod.GET,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public List<Cliente> findAll(){
		return clienteService.findAll();
	}
	
	
	@RequestMapping(value="/cliente/save",method=RequestMethod.POST,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public ResponseEntity<?> saveCliente(@RequestBody Cliente cliente){
		clienteService.saveCliente(cliente);
		return ResponseEntity.ok(HttpStatus.OK);
	}
	
	
	@RequestMapping(value="/cliente/delete",method=RequestMethod.DELETE,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public ResponseEntity<?> deleteCliente(@RequestBody Cliente cliente){
		clienteService.saveCliente(cliente);
		return ResponseEntity.ok(HttpStatus.OK);
	}
	
	
	
	
	

}
