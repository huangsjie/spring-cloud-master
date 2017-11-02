package com.cloud.master.core.abs;

import java.util.List;
import java.util.Map;


public abstract class AbstractServiceImpl<T> implements AbstractService<T> {

    protected abstract AbstractMapper<T> getAbstractMapper();

    @Override
    public int deleteByPrimaryKey(String id) {
        return getAbstractMapper().deleteByPrimaryKey(id);
    }

    @Override
    public int insert(T record) {
        return getAbstractMapper().insert(record);
    }

    @Override
    public int insertSelective(T record) {
        return getAbstractMapper().insertSelective(record);
    }

    @Override
    public T selectByPrimaryKey(String id) {
        return getAbstractMapper().selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(T record) {
        return getAbstractMapper().updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(T record) {
        return getAbstractMapper().updateByPrimaryKey(record);
    }

    @Override
    public List<T> list() {
        return getAbstractMapper().selectAll();
    }

    @Override
    public int deletes(List<String> ids) {
        return getAbstractMapper().deletes(ids);
    }

    @Override
    public int count(Map<String, Object> pagerParams) {
        return getAbstractMapper().count(pagerParams);
    }

    /**
     * 分页查询等
     * @param pagerParams
     * @return
     */
    public List<T> selectByParams(Map<String, Object> pagerParams){
        return getAbstractMapper().selectByParams(pagerParams);
    }
}
