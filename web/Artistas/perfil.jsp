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
        <form method="Post" action="<c:url value='/Artistas/cambios'/>">
            <table>
                <tr>
                    <td>Nombre</td>
                    <td>Telefono</td>
                    <td>Dirección</td>
                    <td></td>
                </tr>
                <tr>
                    <c:forEach var="artista" items="${usuario.artistas}" varStatus="iter">
                        <td><input required="required" type="text" name="nombre" value="${artista.nombre}"></td>
                        <td><input required="required" type="text" name="telefono" value="${artista.telefono}"></td>
                        <td><input required="required" type="text" name="direccion" value="${artista.direccion}"></td>
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
