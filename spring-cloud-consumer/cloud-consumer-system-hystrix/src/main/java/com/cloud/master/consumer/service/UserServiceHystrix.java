package com.cloud.master.consumer.service;

import com.cloud.master.consumer.impl.UserServiceHystrixImpl;
import com.cloud.master.model.Users;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/10/26.
 */

@FeignClient(name= "cloud-producer-system",fallback = UserServiceHystrixImpl.class)
public interface UserServiceHystrix {

    @RequestMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/getUserList",method = RequestMethod.GET)
    List<Users> getUserList(@RequestParam("account") Map<String,Object> account);


}
