package com.mytest.dao;

import com.mytest.beans.User;

import java.util.List;

/**
 * ClassName:TransferDao
 * Package: com.mytest.dao
 * Description:
 *
 * @Date: 2021/5/10 11:13
 * @Author: 惜名
 */
public interface TransferDao {
    List<User> selectAll();
    User selectByUsername(String name);
    int updateByUser(User user);
}
