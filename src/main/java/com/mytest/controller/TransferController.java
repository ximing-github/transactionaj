package com.mytest.controller; /**
 * ClassName:${NAME}
 * Package: ${PACKAGE_NAME}
 * Description:
 *
 * @Date: 2021/5/10 20:04
 * @Author: 惜名
 */

import com.mytest.beans.User;
import com.mytest.service.TransferService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class TransferController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       request.setCharacterEncoding("utf-8");
        String outusername = request.getParameter("outusername");
        String inusername = request.getParameter("inusername");
        double num = Double.parseDouble(request.getParameter("num"));
        /*ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");*/
        WebApplicationContext applicationContext =
                WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
        TransferService transferService =
                (TransferService) applicationContext.getBean("transferService");
        try {
            if(transferService.transfer(outusername,inusername,num)){
                request.getRequestDispatcher("/secsess.jsp").forward(request,response);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());

        }

          request.getRequestDispatcher("/").forward(request,response);


    }
}
