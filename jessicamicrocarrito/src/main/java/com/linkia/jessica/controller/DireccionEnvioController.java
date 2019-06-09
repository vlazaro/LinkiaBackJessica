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

import com.linkia.jessica.model.Direccionenvio;
import com.linkia.jessica.model.Orden;
import com.linkia.jessica.service.IDireccionEnvio;

@RefreshScope
@RestController
public class DireccionEnvioController {

	@Autowired
	IDireccionEnvio direccionService;
	
	@RequestMapping(value="/direccion/find/{id}",method=RequestMethod.GET,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public Optional<Direccionenvio> findById(@PathVariable Integer id){
		return direccionService.findById(id);
	}
	
	@RequestMapping(value="/direccion/findall",method=RequestMethod.GET,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public List<Direccionenvio> findAll(){
		return direccionService.findAll();
	}
	
	
	@RequestMapping(value="/direccion/save",method=RequestMethod.POST,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public ResponseEntity<?> saveOrden(@RequestBody Direccionenvio direccionenvio){
		direccionService.saveDireccionEnvio(direccionenvio);
		return ResponseEntity.ok(HttpStatus.OK);
	}
	
	
	@RequestMapping(value="/direccion/delete",method=RequestMethod.DELETE,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public ResponseEntity<?> deleteOrden(@RequestBody Direccionenvio direccionenvio){
		direccionService.deleteDireccionEnvio(direccionenvio);
		return ResponseEntity.ok(HttpStatus.OK);
	}
	
}
