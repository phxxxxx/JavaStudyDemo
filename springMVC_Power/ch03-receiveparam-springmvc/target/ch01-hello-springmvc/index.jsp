<%--
  Created by IntelliJ IDEA.
  User: wukai
  Date: 2020/10/30
  Time: 20:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>提交参数给controller</title>
</head>
<body>
<p>received param</p>
<form action="recevice.do">
    姓名<input type="text" name="name"><br/>
    年龄<input type="text" name="age"><br/>
    <input type="submit" name="提交参数">
</form>



</body>
</html>
