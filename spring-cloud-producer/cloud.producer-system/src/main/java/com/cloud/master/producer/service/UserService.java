package com.cloud.master.producer.service;

import com.cloud.master.core.abs.AbstractService;
import com.cloud.master.model.Users;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/10/25.
 */
public interface UserService extends AbstractService<Users>{

    List<Users> selectUsersList(Map<String,Object> params);

}
