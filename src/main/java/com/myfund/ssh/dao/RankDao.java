package com.myfund.ssh.dao;

import com.myfund.ssh.entity.User;

import java.util.List;

/**
 * 针对数据库进行直接操作
 *
 * @author: haocheng
 * @date: 2019-05-15 15:10
 */
public interface RankDao {

    //获取定投排名信息
    List getRankInfo();

}
