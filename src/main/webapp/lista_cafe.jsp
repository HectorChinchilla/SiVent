<%-- 
    Document   : lista_cafe
    Created on : 3/04/2019, 01:10:44 AM
    Author     : hector-chinchilla
--%>

<%@page import="com.dao.CafeDao"%>
<%@page import="com.clases.Cafe"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="esti.css" type="text/css">
    </head>
    <body id="ho">

        <div>
            <h1>Lista de Cafe</h1>

            <button onclick="location.href = 'index.jsp'" style="font-size: 20px;" >Volver</button>
            <br>
            <br>

            <%
                CafeDao ca = new CafeDao();
            %>
            <table border="2">
                <tr>
                    <th>Nombre</th>
                </tr>
                <%
                for (Cafe c : ca.cofList()) {%>
                <tr>
                    <td><%= c.getNombre()%></td>
                    <td><a href="CafeById?id=<%= c.getId()%>">Detalle</a></td>
                </tr>                <%}
                %>
            </table>
        </div>
    </body>
</html>
