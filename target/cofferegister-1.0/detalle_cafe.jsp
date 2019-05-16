<%-- 
    Document   : detalle_cafe
    Created on : 3/04/2019, 02:14:05 AM
    Author     : hector-chinchilla
--%>

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

            <form method="post" action="ActualizarCafe">
                <input name="id" type="hidden" value="${ca.id}">
                <input name="nombre" value="${ca.nombre}" type="text" required minlength="2">
                <br>
                <br>
                <button>Actualizar</button>
                <br>
                <br>
                <a href = "lista_cafe.jsp">Volver A La Lista</a>
            </form>
    </body>
</html>
