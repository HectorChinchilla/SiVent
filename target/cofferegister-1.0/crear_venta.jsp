<%-- 
    Document   : crear_venta
    Created on : 25/03/2019, 08:11:27 PM
    Author     : hector-chinchilla
--%>
<%@page import="com.clases.Cliente"%>
<%@page import="com.dao.ClienteDao"%>
<%@page import="com.clases.Cafe"%>
<%@page import="com.dao.CafeDao"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro Venta</title>
        <link rel="stylesheet" href="estilo.css" type="text/css">
    </head>

    <body id="ho">

        <div>

            <h1 style="color:white">Registro De Venta</h1>

            <button onclick="location.href = 'index.jsp'" style="font-size: 20px;" >Volver</button>
            <br>
            <br>

            <form method="post" action="CrearVenta">


                <%
                    CafeDao caf = new CafeDao();
                %>
                <select name="fe">
                    <%
                        for (Cafe fo : caf.cofList()) {%>
                    <option value="<%= fo.getId()%>"><%= fo.getNombre()%></option>
                    <%}
                    %>
                </select>

                <%
                    ClienteDao cli = new ClienteDao();
                %>
                <select name="cl">
                    <%
                        for (Cliente clie : cli.clienteList()) {%>
                    <option value="<%= clie.getId()%>"><%= clie.getNombre()%></option>
                    <%}
                    %>
                </select>
                <br>
                <br>
                <label>Precio:</label>
                <input style="font-size: 20px;" name="pre" type="text" required minlength="2"/>
                <br>
                <br>
                <label>Cantidad:</label>
                <input style="font-size: 20px;" name="can" type="text" required minlength="2"/>
                <br>
                <br>
                <label>Total:</label>
                <input style="font-size: 20px;" name="to" type="text" required minlength="2"/>
                <br>
                <br>
                <button style="font-size: 20px;" >Guardar</button>
                <br>
                <br>
                <button type="reset" style="font-size: 20px;" >Cancelar</button>
            </form>
        </div>
    </body>
</html>
