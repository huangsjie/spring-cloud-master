package com.cloud.master.core;

/**
 * 全局常量
 */
public interface Constants {

    String GLOBAL_USER = "globalUser";  // 用户Session

    String FILE_DOMAIN = "file_domain";

    String GLOBAL_DICT = "globalDict";  // 数据字典用于按钮权限控制

    String GLOBAL_PAGE_ROLES = "globalPageRoles"; // 按钮权限关联

    final int DEFAULT_PAGE_RANGE_SIZE = 10; // 默认的页面范围大小

    final int DEFAULT_PAGE_SIZE = 10; // 每页行数

}
