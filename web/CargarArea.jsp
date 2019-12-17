<%-- 
    Document   : CargarArea
    Created on : 23-jun-2019, 16:43:57
    Author     : Lucia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CargarArea</title>
    </head>
    <body>
        <h1>Cargar Nueva Area</h1>
        <form action="CargarAreaServlet" method="post">
           <label>Nombre Area</label> 
           <input type="text" name="denominacion"><br>
            
            <button type="submit">Agregar</button>
        </form>
    </body>
</html>
