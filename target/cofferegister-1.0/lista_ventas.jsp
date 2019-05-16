<%-- 
    Document   : lista_ventas
    Created on : 25/03/2019, 11:38:48 PM
    Author     : hector-chinchilla
--%>

<%@page import="com.clases.Venta"%>
<%@page import="com.dao.VentaDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista</title>
        <link rel="stylesheet" href="diseno.css" type="text/css">
    </head>
    <body id="ho">
        
        <div>
        <h1>Lista De ventas</h1>

        <button onclick="location.href = 'index.jsp'" style="font-size: 20px;" >Volver</button>
        <br>
        <br>

        <%
            VentaDao v = new VentaDao();
        %>
        <table border="2">
            <tr>
                <th>Cliente</th>
                <th>Cafe</th>
                <th>Cantidad</th>
                <th>Precio</th>
                <th>Total</th>
            </tr>
            <%
                for (Venta z : v.ventaList()) {%>
            <tr>
                <td><%= z.getNombre_cliente()%></td>
                <td><%= z.getNombre_cafe()%></td>
                <td><%= z.getCantidad()%></td>
                <td><%= z.getPrecio()%></td>
                <td><%= z.getTotal()%></td>
                <td><a href="VentaById?id=<%= z.getId()%>"></a></td>
            </tr>                <%}
            %>
        </table>
        </div>

    </body>
</html>
