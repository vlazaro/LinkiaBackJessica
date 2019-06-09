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

import com.linkia.jessica.model.Producto;
import com.linkia.jessica.service.impl.ProductoService;

@RefreshScope
@RestController
public class ProductController {

	@Autowired
	ProductoService productoService;
	
	@RequestMapping(value="/producto/find/{id}",method=RequestMethod.GET,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public Optional<Producto> findById(@PathVariable Integer id){
		return productoService.findById(id);
	}
	
	@RequestMapping(value="/producto/findall",method=RequestMethod.GET,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public List<Producto> findAll(){
		return productoService.findAll();
	}
	
	
	@RequestMapping(value="/producto/save",method=RequestMethod.POST,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public ResponseEntity<?> saveCliente(@RequestBody Producto producto){
		productoService.saveProducto(producto);
		return ResponseEntity.ok(HttpStatus.OK);
	}
	
	
	@RequestMapping(value="/producto/delete",method=RequestMethod.DELETE,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public ResponseEntity<?> deleteCliente(@RequestBody Producto producto){
		productoService.saveProducto(producto);
		return ResponseEntity.ok(HttpStatus.OK);
	}
	
	
	
	
}
