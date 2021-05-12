package com.mytest.service.serviceImpl;

import com.mytest.beans.User;
import com.mytest.dao.TransferDao;
import com.mytest.mythrowable.MyException;
import com.mytest.service.TransferService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * ClassName:TransferServiceImpl
 * Package: com.mytest.service.serviceImpl
 * Description:
 *
 * @Date: 2021/5/10 11:01
 * @Author: 惜名
 */
public class TransferServiceImpl implements TransferService {
    private TransferDao transferDao;

    public void setTransferDao(TransferDao transferDao) {
        this.transferDao = transferDao;
    }

    @Override
    public List<User> selectAllUser() {
       return transferDao.selectAll();
    }

    @Override
    public boolean transfer(String outusername, String inusername, double num) throws MyException {
         User outuser = transferDao.selectByUsername(outusername);
         User inuser = transferDao.selectByUsername(inusername);

         if(outuser.getBalance()>=num){
             outuser.setBalance(outuser.getBalance()-num);

             inuser.setBalance(inuser.getBalance()+num);
             transferDao.updateByUser(outuser);
             int i = 10/0;
             transferDao.updateByUser(inuser);

             return true;
         }else{

            throw new MyException("余额不足");


         }

    }

    @Override
    public User selectOne(String name) {
        return transferDao.selectByUsername(name);
    }


}
