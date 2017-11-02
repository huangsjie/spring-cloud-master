package com.cloud.master.core.abs;


import java.util.List;
import java.util.Map;

/**
 * 抽象公共service
 * Created by Administrator on 2015/6/8.
 */
public interface AbstractService<T> {

    int deleteByPrimaryKey(String id);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);

    List<T> list();


    int deletes(List<String> ids);

    int count(Map<String, Object> pagerParams);

    /**
     * 分页查询等
     * @param pagerParams
     * @return
     */
    List<T> selectByParams(Map<String, Object> pagerParams);
}
