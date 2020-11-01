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
    <title>提交参数给controller 1</title>
 </head>
<body>
<p>处理器方法返回string表示视图名称</p>
<form action="some.do">
    姓名<input type="text" name="name"><br/>
    年龄<input type="text" name="age"><br/>
    <input type="submit" name="提交参数">

</form>
<form action="/WEB-INF/html/source.html">
    <input type="button" name="静态资源">
</form>




</body>
</html>
