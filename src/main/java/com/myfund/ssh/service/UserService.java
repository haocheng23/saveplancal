package com.myfund.ssh.service;

import com.myfund.ssh.entity.User;

import java.util.List;

/**
 * 业务逻辑层（通过调用dao层类来进行修改数据库数据）
 *
 * @author: haocheng
 * @date: 2019-05-15 15:23
 */
public interface UserService {
    boolean addUser(User user);

    boolean login(User user);

    List getAllUser();

    User getUserById(int id);

    boolean updateUser(User user);

    boolean deleteUser(int id);

}
