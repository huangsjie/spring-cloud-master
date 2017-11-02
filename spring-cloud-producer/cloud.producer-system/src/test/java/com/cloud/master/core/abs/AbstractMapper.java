package com.cloud.master.core.abs;


import java.util.List;
import java.util.Map;


public interface AbstractMapper<T> {
    int deleteByPrimaryKey(String id);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);

    List<T> selectAll();

    /**
     * 分页查询等
     * @param pagerParams
     * @return
     */
    List<T> selectByParams(Map<String, Object> pagerParams);

    int deletes(List<String> ids);

    int count(Map<String, Object> params);

}
