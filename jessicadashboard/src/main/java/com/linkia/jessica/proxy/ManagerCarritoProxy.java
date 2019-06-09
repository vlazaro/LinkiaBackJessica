package com.linkia.jessica.proxy;

import java.util.List;
import java.util.Optional;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.linkia.jessica.model.Direccionenvio;
import com.linkia.jessica.model.Orden;

@FeignClient(name="JessicaMicroProduct")
@RibbonClient(name="JessicaMicroProduct")

public interface ManagerCarritoProxy {
	@RequestMapping(value="/orden/find/{id}",method=RequestMethod.GET,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public Optional<Orden> findById(@PathVariable Integer id);
	
	@RequestMapping(value="/orden/findall",method=RequestMethod.GET,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public List<Orden> findAll();
	
	@RequestMapping(value="/orden/save",method=RequestMethod.POST,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public ResponseEntity<?> saveOrden(@RequestBody Orden orden);
	
	
	@RequestMapping(value="/orden/delete",method=RequestMethod.DELETE,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public ResponseEntity<?> deleteOrden(@RequestBody Orden orden);
	
	@RequestMapping(value="/orden/find/{estado}/{clienteid}",method=RequestMethod.GET,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public List<Orden> findOrdenByEstadoAndCustomer(@PathVariable String estado,@PathVariable Integer clienteid);
	
	@RequestMapping(value="/orden/find/{clienteid}",method=RequestMethod.GET,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public List<Orden> findOrdenByCustomer(@PathVariable Integer clienteid);
	
	
	// DIRECCION DE ENVIO
	
	@RequestMapping(value="/direccion/find/{id}",method=RequestMethod.GET,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public Optional<Direccionenvio> findByIdDireccion(@PathVariable Integer id);
	
	@RequestMapping(value="/direccion/findall",method=RequestMethod.GET,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public List<Direccionenvio> findAllDireccion();
	
	
	@RequestMapping(value="/direccion/save",method=RequestMethod.POST,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public ResponseEntity<?> saveDireccion(@RequestBody Direccionenvio direccionenvio);
	
	
	@RequestMapping(value="/direccion/delete",method=RequestMethod.DELETE,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public ResponseEntity<?> deleteDireccion(@RequestBody Direccionenvio direccionenvio);
	
	
	
	
}
