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

import com.linkia.jessica.model.Orden;
import com.linkia.jessica.service.impl.OrdenService;


@RefreshScope
@RestController
@RequestMapping("/orden")
public class OrdenController {

	@Autowired
	OrdenService ordenService;
	
	@RequestMapping(value="/find/{id}",method=RequestMethod.GET,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public Optional<Orden> findById(@PathVariable Integer id){
		return ordenService.findById(id);
	}
	
	@RequestMapping(value="/findall",method=RequestMethod.GET,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public List<Orden> findAll(){
		return ordenService.findAll();
	}
	
	
	@RequestMapping(value="/save",method=RequestMethod.POST,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public ResponseEntity<?> saveOrden(@RequestBody Orden orden){
		ordenService.saveOrden(orden);
		return ResponseEntity.ok(HttpStatus.OK);
	}
	
	
	@RequestMapping(value="/delete",method=RequestMethod.DELETE,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public ResponseEntity<?> deleteOrden(@RequestBody Orden orden){
		ordenService.deleteOrden(orden);
		return ResponseEntity.ok(HttpStatus.OK);
	}
	
	@RequestMapping(value="/find/{estado}/{clienteid}",method=RequestMethod.GET,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public List<Orden> findOrdenByEstadoAndCustomer(@PathVariable String estado,@PathVariable Integer clienteid){
		return ordenService.findOrdenByEstadoAndCliente(estado, clienteid);
	}
	
	@RequestMapping(value="/find/{clienteid}",method=RequestMethod.GET,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public List<Orden> findOrdenByCustomer(@PathVariable Integer clienteid){
		return ordenService.findOrdenByCliente(clienteid);
	}
	
	
	
	
	
}
