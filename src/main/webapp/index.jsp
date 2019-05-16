<%-- 
    Document   : index
    Created on : 23/03/2019, 01:21:15 AM
    Author     : hector-chinchilla
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Primera Pagina</title>
        <link rel="stylesheet" href="diseno.css" type="text/css">
    </head>
    <body id="ho">

        <div>

            <h1>Bienvenido Elija Una Opcion!!</h1>

            <button style="font-size: 20px;" onclick="location.href = 'crear_cliente.jsp'">Registrar Cliente</button>
            <br>
            <br>
            <button style="font-size: 20px;" onclick="location.href = 'crear_cafe.jsp'">Registrar Café</button>
            <br>
            <br>
            <button style="font-size: 20px;" onclick="location.href = 'crear_venta.jsp'">Registrar Venta</button>
            <br>
            <br>
            <button style="font-size: 20px;" onclick="location.href = 'lista_clientes.jsp'">Lista De Clientes</button>
            <br>
            <br>
            <button style="font-size: 20px;" onclick="location.href = 'lista_ventas.jsp'">Lista De Ventas</button>
            <br>
            <br>
            <button style="font-size: 20px;" onclick="location.href = 'lista_cafe.jsp'">Lista De Cafe</button>
        </div>
    </body>
</html>
