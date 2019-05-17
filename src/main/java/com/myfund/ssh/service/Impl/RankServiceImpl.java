package com.myfund.ssh.service.Impl;

import com.myfund.ssh.dao.RankDao;
import com.myfund.ssh.dao.UserDao;
import com.myfund.ssh.entity.User;
import com.myfund.ssh.service.RankService;
import com.myfund.ssh.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: haocheng
 * @date: 2019-05-15 15:25
 *
 */
@Service("rankService")
public class RankServiceImpl implements RankService {

    //自动注入userDao,也可以使用@Autowired
    @Resource
    private RankDao rankDao;


    @Override
    public List getRankInfo() {
        return rankDao.getRankInfo();
    }
}
