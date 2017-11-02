package com.cloud.master.controller;

import com.cloud.master.model.Users;
import com.cloud.master.producer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by Administrator on 2017/10/23.
 */
@RestController
public class UserController {

    //@Autowired
    //private UsersMapper usersMapper;

    @Autowired
    private UserService userService;


    @RequestMapping(value="/hello")
    public String index(@RequestParam String name) {
        return "hello " + name + "，this is first message";
    }

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public Users getUsers() {
        return userService.selectByPrimaryKey("12a560ec-37ad-4b03-a2e1-6c713220ec2f");

    }

    @RequestMapping(value = "/getUserList",method = RequestMethod.GET)
    public List<Users> getUserList(@RequestParam String account) {
        Map<String, Object> params = new HashMap<String, Object>();
        if (account != null && !account.equals("")) {
            params.put("account", account);
        }
        return userService.selectUsersList(params);
    }


}
