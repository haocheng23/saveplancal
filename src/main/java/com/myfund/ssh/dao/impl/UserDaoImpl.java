package com.myfund.ssh.dao.impl;

import com.myfund.ssh.dao.UserDao;
import com.myfund.ssh.entity.User;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;


/**
 *
 * @author: haocheng
 * @date: 2019-05-15 15:12
 *
 */
//出现Exception异常回滚
@Transactional(rollbackFor = Exception.class)
//进行注入
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;


    @Override
    public void add(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public boolean login(User user) {
        String hsql = "FROM User u where u.name=? and u.password=?";
        System.out.println(hsql);
        Query query = sessionFactory.getCurrentSession().createQuery(hsql);
        query.setString(0, user.getName());
        query.setString(1,user.getPassword());
        Iterator<User> it = query.iterate();
        if (it.hasNext()) {
            System.out.println(true);
            return true;
        }else{
            System.out.println(false);
            return false;
        }
    }

    @Override
    public List getUser() {
        return sessionFactory.getCurrentSession().createQuery("FROM User ").list();
    }

    @Override
    public User getUser(int id) {
        //当getCurrentSession所在的方法，或者调用该方法的方法绑定了事务之后，
        //session就与当前线程绑定了，也就能通过currentSession来获取，否则就不能。
        return (User) sessionFactory.getCurrentSession().get(User.class, id);
    }

    @Override
    public void update(User user) {
        sessionFactory.getCurrentSession().update(user);
    }

    @Override
    public void delete(int id) {
        Object o = sessionFactory.getCurrentSession().get(User.class, id);
        sessionFactory.getCurrentSession().delete(o);
    }
}
