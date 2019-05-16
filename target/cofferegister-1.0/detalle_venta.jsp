<%-- 
    Document   : detalle_venta
    Created on : 3/04/2019, 03:05:56 AM
    Author     : hector-chinchilla
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detalle</title>
        <link rel="stylesheet" href="esti.css" type="text/css">
    </head>
    <body id="ho">
        <h1>Detalle de venta</h1>
        <div>
            <form method="post" action="ActualizarVenta">
                <input name="id" type="hidden" value="${clnt.id}">
                <input name="pre" value="${clnt.precio}" type="text" required minlength="2">
                <br>
                <br>
                <input name="can" value="${clnt.cantidad}" type="text" required minlength="2">
                <br>
                <br>
                <input name="to" value="${clnt.total}" type="text" required minlength="2">
                <br>
                <br>
                <input name="fe" value="${clnt.nombre_cafe}" type="text" required minlength="2">
                <br>
                <br>
                <input name="cl" value="${clnt.nombre_cliente}" type="text" required minlength="2">
                <br>
                <br>
                <button>Actualizar</button>
                <br>
                <br>
                <a href = "lista_clientes.jsp">Volver A La Lista</a>
        </div>

</html>
