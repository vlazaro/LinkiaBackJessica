package com.linkia.jessica.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="JessicaMicroProduct")
@RibbonClient(name="JessicaMicroProduct")
public interface ManagerProductProxy {

}
