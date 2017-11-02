package com.cloud.master.mapper;


import com.cloud.master.core.abs.AbstractMapper;
import com.cloud.master.model.Users;

import java.util.List;
import java.util.Map;

public interface UsersMapper extends AbstractMapper<Users>{


    List<Users> selectUsersList(Map<String,Object> params);


}