<%-- 
    Document   : crear_cafe
    Created on : 25/03/2019, 07:54:39 PM
    Author     : hector-chinchilla
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro Cafe</title>
        <link rel="stylesheet" href="esti.css" type="text/css">
    </head>
    <body id="ho">

        <div>
            <h1>Formulario Registro De Café</h1>

            <button onclick="location.href = 'index.jsp'" style="font-size: 20px;" >Volver</button>
            <br>
            <br> 
            <form method="post" action="/cofferegister/CrearCafe">
                <label>Nombre Del Café:</label>
                <input style="font-size: 20px;" name="vari" type="text" required minlength="2"/>
                <br>
                <br>
                <button style="font-size: 20px;" >Guardar</button>
                <br>
                <br>
                <button type="reset" style="font-size: 20px;" >Cancelar</button>
            </form>
        </div>
</html>
