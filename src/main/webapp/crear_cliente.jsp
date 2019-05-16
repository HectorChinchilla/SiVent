<%-- 
    Document   : crear_cliente
    Created on : 23/03/2019, 01:05:31 AM
    Author     : hector-chinchilla
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro Cliente</title>
        <link rel="stylesheet" href="esti.css" type="text/css">
    </head>
    <body id="ho">

        <div>

            <h1>Formulario Registro De Cliente</h1>

            <button onclick="location.href = 'index.jsp'" style="font-size: 20px;">Volver</button>

            <br>
            <br>

            <form method="post" action="/cofferegister/CrearCliente">
                <label>Nombre:</label>
                <input style="font-size: 20px;" name="nom" type="text" required minlength="2"/>
                <br>
                <br>
                <label>Teléfono:</label>
                <input style="font-size: 20px;" name="tele" type="text" required minlength="2"/>
                <br>
                <br>
                <label>Dirección:</label>
                <input style="font-size: 20px;" name="dire" type="text" required minlength="2"/>
                <br>
                <br>
                <button style="font-size: 20px;" >Guardar</button>
                <br>
                <br>
                <button style="font-size: 20px;" >Cancelar</button>
                <br>
            </form>
        </div>
    </body>
</html>
