package com.mytest.controller;

import com.mytest.beans.User;
import com.mytest.service.TransferService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * ClassName:TransferController
 * Package: com.mytest.controller
 * Description:
 *
 * @Date: 2021/5/10 14:34
 * @Author: 惜名
 */
public class LoginController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        TransferService transferService = (TransferService) applicationContext.getBean("transferService");
        List<User> users = transferService.selectAllUser();

        if(users.contains(user)) {
           request.getRequestDispatcher("/transfer.jsp").forward(request,response);
       }
    }
}
