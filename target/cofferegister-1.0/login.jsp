
<%-- 
    Document   : login
    Created on : 3/04/2019, 07:25:01 AM
    Author     : hector-chinchilla
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="esti.css" type="text/css">
    </head>
    <body>
        <h1>LOG IN.</h1>
        <form method="post" name="ingreso" action="/cofferegister/Login">
            <label>User:</label>
            <input  type="text" name="us">
            <br> <br>
            <label>Password:</label>
            <input type="password" name="co">
            <br> <br>
            <button>Send</button>
            <br> <br>
            <a  href="/cofferegister/register.jsp">Registrarse.</a>  
        </div>
    </form>
</body>
</html>
