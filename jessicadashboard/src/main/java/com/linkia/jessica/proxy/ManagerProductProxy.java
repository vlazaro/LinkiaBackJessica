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

import com.linkia.jessica.model.Producto;

@FeignClient(name="JessicaMicroProduct")
@RibbonClient(name="JessicaMicroProduct")
@RequestMapping("/product")
public interface ManagerProductProxy {

	
	@RequestMapping(value="/find/{id}",method=RequestMethod.GET,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public Optional<Producto> findById(@PathVariable Integer id);
	
	@RequestMapping(value="/findall",method=RequestMethod.GET,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public List<Producto> findAll();
	
	
	@RequestMapping(value="/save",method=RequestMethod.POST,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public ResponseEntity<?> saveCliente(@RequestBody Producto producto);
	
	
	@RequestMapping(value="/delete",method=RequestMethod.DELETE,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public ResponseEntity<?> deleteCliente(@RequestBody Producto producto);
	
	
}
