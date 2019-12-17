<%-- 
    Document   : ListarDToView
    Created on : 21-jun-2019, 15:40:10
    Author     : Lucia
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar</title>
    </head>
    <body>
        <h1>Listado de Sueldos a Pagar</h1>
        <table border="1">
            <tr>
                <th>Nombre</th>
                <th>Sueldo</th>
                
            </tr>
            <c:forEach items="${listaDTOs}" var="d">
                <tr>
                    <td>${d.nombre}</td>
                    <td>${d.sueldoPagar}</td> <!-- calculdo, se llama asi el atributo en la clase DTO-->
                </tr>
                
            </c:forEach>
        </table>
    </body>
</html>
