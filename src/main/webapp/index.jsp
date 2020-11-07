<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="account/findAll">测试</a>

${msg}
<form action="fileUpload/upload1?username=wangtao" enctype="multipart/form-data" method="post">
    <input type="file" name="img"/><br><br>
    <input type="submit" value="上传"/>
</form>

<a href="employee/getEmpById/1">测试查询</a>

<a href="employee/insertEmp">测试插入</a>

<a href="employee/testRedis">测试redis</a>

<a href="employee/testMQProduce">测试active_produce</a>

<a href="employee/testMQConsumer">测试active_consumer</a>
</body>
</html>
