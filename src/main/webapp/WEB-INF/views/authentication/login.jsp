<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style>
    .error{
        text-align: center;
        margin: auto;
        color: red;
        padding-top: 5px;
    }
    .container{
        text-align: center;
        width: 100px;
        height: 20px;
        padding-top: 10px;
        margin: auto;
    }
    #btn{
        font-size: 15px;
    }

    <%@include file='/WEB-INF/views/css/table_dark.css' %>
</style>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1 class="table_dark">Login Page</h1>
<div class="error"> <h4>${errorMsg}</h4> </div>
<form method="post" action="${pageContext.request.contextPath}/login">
    <table border="1" class="table_dark">
    <tr>
    <th>Please enter your login: <input type="text" name="login" required><br> </th></tr>
        <tr><th> Please enter your password: <input type="password" name="password" required> </th> <tr>
    </table>
    <div class="container"> <button id="btn" type="submit">Login</button> </div>
</form>
<h4 style="text-align: center"><a href="${pageContext.request.contextPath}/register">Register</a></h4>
</body>
</html>
