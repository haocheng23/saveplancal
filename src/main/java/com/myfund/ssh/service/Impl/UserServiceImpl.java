package com.myfund.ssh.service.Impl;

import com.myfund.ssh.dao.UserDao;
import com.myfund.ssh.entity.User;
import com.myfund.ssh.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: haocheng
 * @date: 2019-05-15 15:25
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    //自动注入userDao,也可以使用@Autowired
    @Resource
    private UserDao userDao;

    @Override
    public boolean addUser(User user) {
        this.userDao.add(user);
        return true;
    }

    @Override
    public boolean login(User user) {
        this.userDao.login(user);
        return true;
    }

    @Override
    public List getAllUser() {
        return this.userDao.getUser();
    }

    @Override
    public User getUserById(int id) {
        return this.userDao.getUser(id);
    }

    @Override
    public boolean updateUser(User user) {
        this.userDao.update(user);
        return true;
    }

    @Override
    public boolean deleteUser(int id) {
        this.userDao.delete(id);
        return true;
    }
}
