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
        <title>Usuarios</title>
    </head>
    <body>
        <jsp:include page="/menu.jsp" />
        <table>
            <tr><th>
                    Usuario
                </th>
                <th>
                    Contraseña
                </th>
                <th>
                    Tipo
                </th>
                <th>
                    nombre
                </th>
                <th>
                    telefono
                </th>
                <th>
                    dirección
                </th>
            </tr>
            <c:forEach var="Usuario" items="${Usuarios}" varStatus="iter">
                <tr><td>
                        ${Usuario.usuario}
                    </td>
                    <td>
                        ${Usuario.password}
                    </td>
                    <c:forEach var="artista" items="${Usuario.artistas}" varStatus="iter">
                        <td>
                            Artista
                        </td>
                        <td>
                            ${artista.nombre}
                        </td>
                        <td>

                            ${artista.telefono}
                        </td>
                        <td>

                            ${artista.direccion}
                        </td>
                    </c:forEach>
                    <c:forEach var="Usuario" items="${Usuario.clientes}" varStatus="iter">
                        <td>
                            Cliente
                        </td>
                        <td>
                            ${Usuario.nombre}
                        </td>
                        <td>

                            ${Usuario.telefono}
                        </td>
                        <td>

                            ${Usuario.direccion}
                        </td>
                    </c:forEach>
                </tr>
            </c:forEach>
        </table>
        <br />
        <h2>Ingresar Artista</h2>
        <form method="Post" action="<c:url value='/BackEnd/usuarios/nuevo'/>">
            <table>
                <tr>
                    <td>Usuario</td>
                    <td>Contraseña</td>
                    <td>Nombre</td>
                    <td>Telefono</td>
                    <td>Dirección</td>
                    <td></td>
                </tr>
                <tr>
                    <td><input required="required" type="text" name="usuario"></td>
                    <td><input required="required" type="password" name="password"></td>
                    <td><input required="required" type="text" name="nombre"></td>
                    <td><input required="required" type="text" name="telefono"></td>
                    <td><input required="required" type="text" name="direccion"></td>
                    <td><input type="submit" value="Agregar"></td>
                </tr>
            </table>

        </form>

    </body>
</html>