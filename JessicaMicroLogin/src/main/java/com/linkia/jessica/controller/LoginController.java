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
import com.linkia.jessica.model.Login;
import com.linkia.jessica.service.IAdministrador;
import com.linkia.jessica.service.ILogin;

@RefreshScope
@RestController
public class LoginController {

	@Autowired
	ILogin loginService;
	
	@Autowired
	IAdministrador adminService;
	
	
	@RequestMapping(value="/login/find/{id}",method=RequestMethod.GET,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public Optional<Login> findById(@PathVariable Integer id){
		return loginService.findById(id);
	}
	
	@RequestMapping(value="/login/findall",method=RequestMethod.GET,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public List<Login> findAll(){
		return loginService.findAll();
	}
	
	
	@RequestMapping(value="/login/save",method=RequestMethod.POST,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public ResponseEntity<?> saveLogin(@RequestBody Login login){
		loginService.saveLogin(login);
		return ResponseEntity.ok(HttpStatus.OK);
	}
	
	
	@RequestMapping(value="/login/delete",method=RequestMethod.DELETE,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public ResponseEntity<?> deleteCliente(@RequestBody Login login){
		loginService.saveLogin(login);
		return ResponseEntity.ok(HttpStatus.OK);
	}
	
	@RequestMapping(value="/login/validate",method=RequestMethod.POST,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public ResponseEntity<?> validateUser(@RequestBody Login login){
		loginService.findByUserPassword(login.getUsername(), login.getPassword());
		return ResponseEntity.ok(HttpStatus.OK);
	}
	
	
	
	
	
	
	
}
