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
import com.linkia.jessica.model.Administrador;
import com.linkia.jessica.service.IAdministrador;

@RefreshScope
@RestController
public class AdministradorController {

	@Autowired
	IAdministrador adminService;
	
	
	@RequestMapping(value="/admin/find/{id}",method=RequestMethod.GET,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public Optional<Administrador> findById(@PathVariable Integer id){
		return adminService.findById(id);
	}
	
	@RequestMapping(value="/admin/findall",method=RequestMethod.GET,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public List<Administrador> findAll(){
		return adminService.findAll();
	}
	
	
	@RequestMapping(value="/admin/save",method=RequestMethod.POST,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public ResponseEntity<?> saveAdministrador(@RequestBody Administrador admin){
		adminService.saveAdministrador(admin);
		return ResponseEntity.ok(HttpStatus.OK);
	}
	
	
	@RequestMapping(value="/admin/delete",method=RequestMethod.DELETE,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public ResponseEntity<?> deleteCliente(@RequestBody Administrador admin){
		adminService.saveAdministrador(admin);
		return ResponseEntity.ok(HttpStatus.OK);
	}
	
	@RequestMapping(value="/admin/validate",method=RequestMethod.POST,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public ResponseEntity<?> validateUser(@RequestBody Administrador admin){
		adminService.findByUserPassword(admin.getUsername(), admin.getPassword());
		return ResponseEntity.ok(HttpStatus.OK);
	}
	
	
	
	
	
	
	
}
