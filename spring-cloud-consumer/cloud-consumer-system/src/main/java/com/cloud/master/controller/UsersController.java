package com.cloud.master.controller;

import com.cloud.master.model.Users;
import com.cloud.master.producer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2017/10/25.
 */
@RestController
public class UsersController {

    @Autowired
    private UserService userService;

    // provider controller 里面的方法
    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public Users getUsers() {
        return userService.getUser();
    }

    @RequestMapping(value = "/getUserList",method =RequestMethod.GET)
    public List<Users> getUserList(@RequestParam String account){
        return userService.getUserList(account);
    }
}
