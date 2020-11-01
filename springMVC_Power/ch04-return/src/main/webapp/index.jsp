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
    <script type="text/javascript" src="js/jquery-3.3.1.js"></script>
    <script type="text/javascript">
        $(function () {
            $("button").click(function () {
                alert("button click")
                $.ajax({
                    // url:"returnVoidAjax.do",
                    //url:"doReturnsUserByMvc.do",
                    url:"doReturnsListByMvc.do",
                    data:{
                        name:"zhangsan",
                        age:99
                    },
                    type:"post",
                    dataType:"json",
                    success:function (response) {
                        alert(response);
                      $.each(response,function (i,n) {
                          alert(n.name+"  "+n.age);

                      })
                    }
                })
            })
        })
    </script>
</head>
<body>
<p>处理器方法返回string表示视图名称</p>
<form action="returnstring-view.do">
    姓名<input type="text" name="name"><br/>
    年龄<input type="text" name="age"><br/>
    <input type="submit" name="提交参数">
</form>
<br/>
<button id="btn">发起ajax请求</button>





</body>
</html>
