package com.cloud.master.consumer.impl;

import com.cloud.master.consumer.service.UserServiceHystrix;
import com.cloud.master.model.Users;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/10/26.
 */
@Component
public class UserServiceHystrixImpl implements UserServiceHystrix {

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "Hello This Is Error hello method";
    }

    @Override
    public List<Users> getUserList(@RequestParam("account") Map<String, Object> account) {
        List<Users> usersList = new ArrayList<Users>();
        return usersList;
    }


}
