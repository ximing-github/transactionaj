package com.mytest.service;

import com.mytest.beans.User;

import java.util.List;

/**
 * ClassName:transferService
 * Package: com.mytest.service
 * Description:
 *
 * @Date: 2021/5/10 10:55
 * @Author: 惜名
 */
public interface TransferService {

     List<User> selectAllUser();
     boolean transfer(String outusername,String inusername,double num) ;
     User selectOne(String name);


}
