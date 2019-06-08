package com.linkia.jessica.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="JessicaMicroSearch")
@RibbonClient(name="JessicaMicroSearch")
public interface ManagerSearchProxy {

}
