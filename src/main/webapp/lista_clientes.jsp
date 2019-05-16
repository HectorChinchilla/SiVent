<%-- 
    Document   : lista_clientes
    Created on : 31/03/2019, 12:45:09 AM
    Author     : hector-chinchilla
--%>

<%@page import="com.clases.Cliente"%>
<%@page import="com.dao.ClienteDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clientes</title>
        <link rel="stylesheet" href="diseno.css" type="text/css">
    </head>

    <body id="ho">

        <div>

            <h1>Lista Clientes</h1>

            <button onclick="location.href = 'index.jsp'" style="font-size: 20px;" >Volver</button>
            <br>
            <br>

            <%
                ClienteDao clien = new ClienteDao();
            %>
            <table border="2">
                <tr>
                    <th>Nombre</th>
                    <th>Telefono</th>
                    <th>Direccion</th>
                </tr>
                <%
                for (Cliente c : clien.clienteList()) {%>
                <tr>
                    <td><%= c.getNombre()%></td>
                    <td><%= c.getTelefono()%></td>
                    <td><%= c.getDireccion()%></td>
                    <td><a href="/cofferegister/ClienteById?id=<%= c.getId()%>">Detalle</a></td>
                </tr>                <%}
                %>

                <tr>
                    <th></th>
                </tr>
            </table>
        </div>
    </body>
</html>
