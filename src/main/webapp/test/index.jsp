
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>欢迎页面</title>
        <base href="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/"/>
    </head>
    <body>
        <form action="login.do" method="post">
            用户名  <input type="text" name="username"/><br/>
            密码   <input type="password" name="password"/><br/>
                  <input type="submit" value="确认">

        </form>

    </body>
</html>
