<%-- 
    Document   : catalogo
    Created on : Sep 4, 2015, 9:10:33 AM
    Author     : Administrator
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Catalogo</title>
    </head>
    <body>
        <jsp:include page="/menu.jsp" />
        <h1>Catalogo</h1>

        <table>
            <tr>        
                <td valign="top">     
                    <table>
                        <tr><th>
                                Nombre
                            </th>
                            <th>
                                Descripcion
                            </th>
                            <th>
                                Popularidad
                            </th>
                            <th>
                                Valor
                            </th>
                            <th>
                                Tematica
                            </th>

                        </tr>
                        <c:forEach var="estampado" items="${catalogo}" varStatus="iter">

                            <tr><td>
                                    ${estampado.nombre}
                                </td>
                                <td>
                                    ${estampado.descripcion}
                                </td>
                                <td>

                                    ${estampado.popularidad}
                                </td>
                                <td>

                                    ${estampado.valor}
                                </td>
                                <td>

                                    <c:forEach var="tematica" items="${estampado.temas}" varStatus="iter">
                                        ${tematica.nombre}    
                                    </c:forEach>
                                </td>
                                <td>
                                    <c:if   test="${not empty usuario.clientes}">
                                        <a href="<c:url value='/Comprar?id=${estampado.idestampado}'/>">
                                            comprar
                                        </a> 
                                    </c:if>
                                </td>

                            </tr>
                        </c:forEach> 


                    </table>
                </td>
            </tr>
            <c:if test="${!empty mensaje}">

                <tr>
                    <td colspan="2" style="text-align:left">
                            <br><span >${mensaje}</span>
                    </td>
                </tr>

            </c:if>
        </table>
        <%
            getServletContext().setAttribute("mensaje", null);
        %>
    </body>
</html>
