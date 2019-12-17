<%-- 
    Document   : CargarEmpleadoView
    Created on : 21-jun-2019, 15:35:36
    Author     : Lucia
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alta</title>
    </head>
    <body>
        <h1>Cargar Empleado</h1>
        <form action="CargarEmpleadoServlet" method="post">
            <label>Sueldo Basico</label>
            <input type="text" name="sueldoBasico"><br>
            
            <label>Area</label> &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp
            <select name="area"
                    <c:forEach items="${listaAr}" var="are">
                        <option value="${are.idArea}">${are.denominacion}
                            
                        </option>
                        
                    </c:forEach>
            </select> <br>
            <label>Nombre Empleado</label>
            <input type="text" name="nombre"><br>
                   
        <label>Año de ingreso</label>
            <input type="text" name="ingreso"><br><br><br>
            
       <!--<button class="btn btn-primary" type="submit">CARGAR</button>-->
        <button type="submit">Agregar</button>
        
        </form>
    </body>
</html>
