<%--
  Created by IntelliJ IDEA.
  User: 余生
  Date: 2019/12/16
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
        <a href="account/findall">请求查询所有信息</a>

        <form action="account/save" method="post">
            姓名：<input type="text" name="name">
            金额：<input type="text" name="money">
            <input type="submit" value="提交" >
        </form>
</body>
</html>
