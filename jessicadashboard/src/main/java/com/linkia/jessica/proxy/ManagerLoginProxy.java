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

import com.linkia.jessica.model.Login;

@FeignClient(name="JessicaMicroLogin")
@RibbonClient(name="JessicaMicroLogin")
public interface ManagerLoginProxy {

	@RequestMapping(value="/login/find/{id}",method=RequestMethod.GET,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public Optional<Login> findById(@PathVariable Integer id);
	
	
	@RequestMapping(value="/login/findall",method=RequestMethod.GET,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public List<Login> findAll();
	
	@RequestMapping(value="/login/save",method=RequestMethod.POST,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public ResponseEntity<?> saveLogin(@RequestBody Login login);
	
	@RequestMapping(value="/login/delete",method=RequestMethod.DELETE,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public ResponseEntity<?> deleteCliente(@RequestBody Login login);
	
	@RequestMapping(value="/login/validate",method=RequestMethod.POST,headers="Accept=application/json",produces ="application/json")
	@ResponseBody
	public ResponseEntity<?> validateUser(@RequestBody Login login);
	
}
