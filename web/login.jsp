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
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="/menu.jsp" />
        <h1>Iniciar Sesion</h1>
        <c:if test="${empty usuario}">
            <form method="Post" action="autenticar">
                <table>
                    <tr>
                        <td>Usuario:</td>
                        <td><input type="text" name="usuario"></td>
                        <td>Password:</td>
                        <td><input type="password" name="password"></td>
                        <td align="right"><input type="submit" value="Ingresar"></td>
                    </tr>
                    <c:if test="${!empty mensaje}">
                        <tr>
                            <td colspan="4" style="text-align:left">                                      
                                <br>${mensaje}                          
                            </td>
                        </tr>

                    </c:if>
                </table>
            </form>
            <h2>Registro</h2>
            <form method="Post" action="<c:url value='/registrar'/>">
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
                        <td><input type="submit" value="Registrar"></td>
                    </tr>
                </table>

            </form>


        </c:if>
        <c:if test="${!empty usuario}">
            <form method="Post" action="salir">
                <input type="submit" value="Cerrar Session">
            </form>
        </c:if>
        <%
            getServletContext().setAttribute("mensaje", null);
        %>

    </body>
</html>
