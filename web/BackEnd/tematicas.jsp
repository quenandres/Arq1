<%-- 
    Document   : proveedor
    Created on : Mar 15, 2013, 9:17:40 AM
    Author     : administrador
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <title>Tematicas</title>
    </head>
    <body>
        <jsp:include page="/menu.jsp" />
        <table>
            <tr>
                <th>
                    Tematicas
                </th>
            </tr>
            <c:forEach var="tema" items="${tematicas}" varStatus="iter">
                <tr><td>
                        ${tema.nombre}
                    </td>
                </tr>
            </c:forEach>
        </table>
        <br />
        <h2>Ingresar Tematica</h2>
        <form method="Post" action="<c:url value='/BackEnd/tematicas/nuevo'/>">
            <table>
                <tr>
                    <td>Tematica</td>
                    <td></td>
                </tr>
                <tr>
                    <td><input required="required" type="text" name="tematica"></td>
                    <td><input type="submit" value="Agregar"></td>
                </tr>
            </table>

        </form>

    </body>
</html>