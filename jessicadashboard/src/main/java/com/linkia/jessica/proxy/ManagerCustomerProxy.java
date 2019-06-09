package com.linkia.jessica.proxy;

import java.util.Collection;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.linkia.jessica.model.Cliente;

@FeignClient(name="JessicaMicroCustomer")
@RibbonClient(name="JessicaMicroCustomer")
public interface ManagerCustomerProxy {
	
	@RequestMapping(value="/cliente/find/{id}",method=RequestMethod.GET)
	public Cliente findById(@PathVariable(value="id") Long id);
	
	
	@RequestMapping(value="/cliente/findall",method=RequestMethod.GET)
	public Collection<Cliente> findByAll();
	
	
	@RequestMapping(value="/cliente/save",method=RequestMethod.POST,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public ResponseEntity<?> saveCliente(@RequestBody Cliente cliente);
	
	@RequestMapping(value="/cliente/delete",method=RequestMethod.DELETE,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public ResponseEntity<?> deleteCliente(@RequestBody Cliente cliente);
	
	

}
