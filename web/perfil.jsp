<%-- 
    Document   : index
    Created on : Sep 7, 2015, 8:30:19 AM
    Author     : Administrator
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Perfil</title>
    </head>
    <body>
        <jsp:include page="/menu.jsp" />    
        <h2>Perfil</h2>
        <form method="Post" action="<c:url value='/registrar/cambios'/>">
            <table>
                <tr>
                    <td>Nombre</td>
                    <td>Telefono</td>
                    <td>Dirección</td>
                    <td></td>
                </tr>
                <tr>
                    <c:forEach var="cliente" items="${usuario.clientes}" varStatus="iter">
                        <td><input required="required" type="text" name="nombre" value="${cliente.nombre}"></td>
                        <td><input required="required" type="text" name="telefono" value="${cliente.telefono}"></td>
                        <td><input required="required" type="text" name="direccion" value="${cliente.direccion}"></td>
                        <td><input type="submit" value="Guardar Cambios"></td>
                        </c:forEach>
                </tr>
            </table>

        </form>
        <br><span >${mensaje}</span>

        <%
            getServletContext().setAttribute("mensaje", null);
        %>

    </body>
</html>
