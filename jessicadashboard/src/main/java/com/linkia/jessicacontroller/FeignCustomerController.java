package com.linkia.jessicacontroller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.linkia.jessica.model.Cliente;
import com.linkia.jessica.proxy.ManagerCustomerProxy;

@RefreshScope
@RestController
@RequestMapping("/dashboard/feign/cliente")
public class FeignCustomerController {

	@Autowired 
	ManagerCustomerProxy customerproxy;
	
	@RequestMapping(value="/find/{id}",method=RequestMethod.GET)
	public Cliente findById(@PathVariable(value="id") Long id) {
		return customerproxy.findById(id);
	}
	
	
	@RequestMapping(value="/findall",method=RequestMethod.GET)
	public Collection<Cliente> findByAll(){
		return customerproxy.findByAll();
	}
	
	
	@RequestMapping(value="/feign/cliente/save",method=RequestMethod.POST,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public ResponseEntity<?> saveCliente(@RequestBody Cliente cliente){
		return customerproxy.saveCliente(cliente);
	}
	
	@RequestMapping(value="/feign/cliente/delete",method=RequestMethod.DELETE,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public ResponseEntity<?> deleteCliente(@RequestBody Cliente cliente){
		customerproxy.deleteCliente(cliente);
		return (ResponseEntity<?>) ResponseEntity.accepted();
	}
	
	
	
	
}
