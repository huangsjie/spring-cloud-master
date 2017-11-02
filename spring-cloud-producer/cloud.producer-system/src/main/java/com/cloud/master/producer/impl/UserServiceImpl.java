package com.cloud.master.producer.impl;


import com.cloud.master.core.abs.AbstractMapper;
import com.cloud.master.core.abs.AbstractServiceImpl;
import com.cloud.master.mapper.UsersMapper;
import com.cloud.master.model.Users;
import com.cloud.master.producer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/10/25.
 */

@Repository
public class UserServiceImpl extends AbstractServiceImpl<Users> implements UserService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    protected AbstractMapper<Users> getAbstractMapper() {
        return usersMapper;
    }

    @Override
    public Users selectByPrimaryKey(String id) {
        return usersMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Users> selectUsersList(Map<String, Object> params) {
        return usersMapper.selectUsersList(params);
    }


}
