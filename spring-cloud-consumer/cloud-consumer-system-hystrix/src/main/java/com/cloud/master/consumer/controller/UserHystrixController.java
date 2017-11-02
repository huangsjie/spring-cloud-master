package com.cloud.master.consumer.controller;

import com.cloud.master.consumer.service.UserServiceHystrix;
import com.cloud.master.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/10/26.
 * 熔断器 Hystrix
 */
@RestController
public class UserHystrixController  {

    @Autowired
    private UserServiceHystrix userServiceHystrix;

    // http://localhost:9001/hello?name=hsj
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(@RequestParam(value = "name") String name) {
        return userServiceHystrix.hello(name);
    }

    //http://localhost:9001/getUserList/storeManager
    @RequestMapping(value = "/getUserList/{account}", method = RequestMethod.GET)
    public List<Users> getUserList(@PathVariable("account") String account) {
        Map<String, Object> params = new HashMap<String, Object>();
        if (account != null && !account.equals("")) {
            params.put("account", account);
        }
        return userServiceHystrix.getUserList(params);
    }

}
