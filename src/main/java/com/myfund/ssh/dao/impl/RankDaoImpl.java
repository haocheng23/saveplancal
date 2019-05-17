package com.myfund.ssh.dao.impl;

import com.myfund.ssh.dao.RankDao;
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
@Repository("rankDao")
public class RankDaoImpl implements RankDao {

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;


    @Override
    public List getRankInfo() {
//        String hql = "select max(dealDate),fundCode from PubFund group by fundCode";
        String hql = "select p1.fundCode,p1.fundName,p2.maxdate,p1.unitEquity " +
                "from PubFund p1, " +
                "(" +
                    "select CONVERT(varchar(100), MAX(dealDate), 23) maxdate,fundCode from PubFund group by fundCode" +
                ") p2 " +
                "where p1.fundCode = p2.fundCode and p1.DealDate = p2.maxdate";
        List list = sessionFactory.getCurrentSession().createQuery(hql).list();
//        .setFirstResult(0).setMaxResults(50)
        return list;
    }
}
