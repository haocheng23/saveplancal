package com.myfund.ssh.dao;

import com.myfund.ssh.entity.User;

import java.util.List;

/**
 * 针对数据库进行直接操作
 *
 * @author: haocheng
 * @date: 2019-05-15 15:10
 */
public interface UserDao {

    /**
     * 添加并保存用户
     */
    void add(User user);

    /**
     * 进行登录
     */
    boolean login(User user);


    /**
     * 获取用户列表
     */
    List getUser();

    /**
     * 根据用户Id获取用户信息
     */
    User getUser(int id);

    /**
     * 更新用户信息
     */
    void update(User user);


    /**
     * 根据用户id删除用户信息
     */
    void delete(int id);

}
