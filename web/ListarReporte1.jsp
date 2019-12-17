<%-- 
    Document   : ListarReporte1
    Created on : 22-jun-2019, 21:35:09
    Author     : Lucia
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reporte1</title>
    </head>
    <body>
        <h1>Reporte 1</h1>
        <table border="1">
            <tr>
                <th><b>Cantidad</b></th>
                <th><b>Sueldo</b></th>
                <th><b>Area</b></th>
                
            </tr>
            <c:forEach items="${listaRep}" var="n">
                <tr>
                    <td>${n.cantidad}</td>
                    <td>${n.sueldo}</td>
                    <td>${n.area}</td>
                </tr>
            </c:forEach>
            
        </table>
    </body>
</html>
