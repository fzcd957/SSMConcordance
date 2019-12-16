<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>查询到所有信息</title>
</head>
<body>
        <h1>查询到所有信息</h1>
        <c:forEach items="${list}" var="li">
            ${li.id}
            ${li.name}
            ${li.money}
        </c:forEach>
</body>
</html>
