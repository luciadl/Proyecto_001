
<%-- 
    Document   : ListarDTO_extra
    Created on : 23-jun-2019, 19:08:30
    Author     : Lucia
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ListarDTO_extra</title>
    </head>
    <body>
        <h1>Lista de empleados por area y año de ingreso</h1>
        <table border="1">
            <tr>
                <th>Nombre</th>
                <th>Area</th>
                <th>Ingreso</th>
            </tr>
            <c:forEach items="${listaE}" var="d">
                <tr>
                    <td>${d.nombre}</td>
                    <td>${d.denominacion}</td>
                    <td>${d.ingreso}</td>
                </tr>         
            </c:forEach>
            
        </table>
    </body>
</html>
