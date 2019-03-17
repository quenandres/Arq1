<%-- 
    Document   : proveedor
    Created on : Mar 15, 2013, 9:17:40 AM
    Author     : administrador
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <title>Estampados</title>
    </head>
    <body>
        <jsp:include page="/menu.jsp" />
        <table>
            <tr><th>

                </th>
                <th>
                    Nombre
                </th>
                <th>
                    Descripción
                </th>
                <th>
                    Valor
                </th>
                <th>
                    Popularidad
                </th>
                <th>
                    Rating
                </th>
            </tr>
            <c:forEach var="artista" items="${usuario.artistas}" varStatus="iter">
                <c:forEach var="estampado" items="${artista.estampados}" varStatus="iter">
                    <tr><td>
                            <a href="<c:url value='/Artistas/estampados?id=${estampado.idestampado}'/>">
                                modificar
                            </a> 
                        </td>
                        <td>
                            ${estampado.nombre}
                        </td>
                        <td>
                            ${estampado.descripcion}
                        </td>
                        <td>
                            ${estampado.valor}
                        </td>
                        <td>
                            ${estampado.popularidad}
                        </td>
                    </tr>
                </c:forEach>
            </c:forEach>
        </table>
        <br />
        <h2>Ingresar Estampados</h2>
        <form method="Post" action="<c:url value='/Artistas/estampados/nuevo'/>">
            <table>
                <tr>
                    <td>Nombre</td>
                    <td>Descripcion</td>
                    <td>Valor</td>
                    <td></td>
                </tr>
                <tr>
                    <td><input required="required" type="text" value="${estampado.nombre}" name="nombre">
                        <input type="hidden" name="id" value="${estampado.idestampado}" />
                        <input type="hidden" name="id" value="${estampado.popularidad}" />
                    </td>
                    <td><input required="required" type="text" value="${estampado.descripcion}" name="descripcion"></td>
                    <td><input required="required" type="text" value="${estampado.valor}" name="valor"></td>
                    <td>
                        <select name="tematica" required="true">
                            <c:forEach var="tema" items="${tematicas}" varStatus="iter">
                                <option value="${tema.idtema}">${tema.nombre}</option>
                        </c:forEach>
                        </select>
                    </td>
                    <td><input type="submit" value="Agregar"></td>
                </tr>
            </table>
        </form>
        <%
            getServletContext().setAttribute("estampado", null);
        %>
    </body>
</html>