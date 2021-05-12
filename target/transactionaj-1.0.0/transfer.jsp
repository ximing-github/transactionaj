<%--
  Created by IntelliJ IDEA.
  User: 惜名
  Date: 2021/5/10
  Time: 15:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>欢迎页面</title>
    </head>
    <body>
        <h5 align="center">欢迎 ${param.username}</h5>
      <div align="center">
        <form action="transfer.do" method="post">
            转出账号 <input type="text" name="outusername"/><br/>
            转入账号 <input type="text" name="inusername"/><br/>
            转账金额 <input type="text" name="num"/><br/>
                    <input type="submit" value="确认">
        </form>
      </div>
    </body>
</html>
