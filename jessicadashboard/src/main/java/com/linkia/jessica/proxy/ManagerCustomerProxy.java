package com.linkia.jessica.proxy;

import java.util.Collection;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.linkia.jessica.model.Cliente;

@FeignClient(name="JessicaMicroCustomer")
@RibbonClient(name="JessicaMicroCustomer")
public interface ManagerCustomerProxy {
	
	@RequestMapping(value="/cliente/find/{id}",method=RequestMethod.GET)
	public Cliente findById(@PathVariable(value="id") Long id);
	
	
	@RequestMapping(value="/cliente/findall}",method=RequestMethod.GET)
	public Collection<Cliente> findByAll();
	
	
	

}
