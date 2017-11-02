package com.cloud.master.core.bean;

import java.util.HashMap;

/**
 * 扩展hashMap
 * Created by Administrator
 */
public class CommonMap<K,V> extends HashMap<K,V>{

    public CommonMap(){}
    public CommonMap(K key, V value){
        this.put(key,value);
    }
    public CommonMap<K,V> add(K key,V value){
        this.put(key,value);
        return this;
    }
    public CommonMap<K,V> delete(K key){
        this.remove(key);
        return this;
    }
}
