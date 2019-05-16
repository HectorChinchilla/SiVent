<%-- 
    Document   : detalle_cliente
    Created on : 3/04/2019, 12:59:16 AM
    Author     : hector-chinchilla
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ss</title>
        <link rel="stylesheet" href="esti.css" type="text/css">
    </head>
    <body id="ho">

        <div>

            <h1>Cliente</h1>
            <form method="post" action="ActualizarCliente">
                <input name="id" type="hidden" value="${clnt.id}">
                <input name="nombre" value="${clnt.nombre}" type="text" required minlength="2">
                <br>
                <br>
                <input name="telefo" value="${clnt.telefono}" type="text" required minlength="2">
                <br>
                <br>
                <input name="direc" value="${clnt.direccion}" type="text" required minlength="2">
                <br>
                <br>
                <button>Actualizar</button>
                <br>
                <br>
                <a href = "lista_clientes.jsp">Volver A La Lista</a>
            </form>
    </body>
</html>
