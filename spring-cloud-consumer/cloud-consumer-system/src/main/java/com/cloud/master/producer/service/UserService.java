package com.cloud.master.producer.service;

import com.cloud.master.model.Users;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by Administrator on 2017/10/24.
 */
@FeignClient(name= "cloud-producer-system")
public interface UserService {

    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    Users getUser();

    @RequestMapping(value = "/getUserList",method = RequestMethod.GET)
    List<Users> getUserList(@RequestParam("account") String account);


}
