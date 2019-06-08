package com.linkia.jessica.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="JessicaMicroLogin")
@RibbonClient(name="JessicaMicroLogin")
public interface ManagerLoginProxy {

}
