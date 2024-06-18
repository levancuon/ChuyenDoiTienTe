<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 6/13/2024
  Time: 4:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Nhập số tiền muốn quy đổi</h2>
<form action="/converter/converted" method="post">
    <input type="text" name="money" > $
    <button type="submit">convert</button>
</form>


</body>
</html>
