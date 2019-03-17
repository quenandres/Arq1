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
        <title>Catalogo - Comprar</title>
    </head>
    <body>
        <jsp:include page="/menu.jsp" />
        <h1>Catalogo - Comprar</h1>

        <table>
            <tr>       
                <td valign="top"> 
                    <form method="Post" action="<c:url value='/Comprar/confirmar'/>">
                    <table>
                        <tr><th>
                                Nombre
                            </th>
                            <th>
                                Descripcion
                            </th>
                            <th>
                                Valor
                            </th>
                            <th>
                                Tematica
                            </th>
                            <th>
                                tono
                            </th>
                            <th>
                                talla
                            </th>
                            <th>
                                estilo
                            </th>
                            <th>
                                ubicacion y tamaño
                            </th>
                            <th>
                                texto
                            </th>
                            <th>
                                cantidad
                            </th>
                            <th>
                                Calificacion Estampa (1-2-3-4-5)
                            </th>
                            <th>
                                Direccion Envio
                            </th>
                            <th>
                               Forma Pago
                            </th>

                        </tr>

                        <tr>
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
                                <c:forEach var="tematica" items="${estampado.temas}" varStatus="iter">
                                    ${tematica.nombre}    
                                </c:forEach>
                            </td>
                            <td>
                                <input required="required" type="text"  value="" name="tono">
                            </td>
                            <td>
                                <input required="required" type="text"  value="" name="talla">
                            </td>
                            <td>
                                <input required="required" type="text"  value="" name="estilo">
                            </td>
                            <td>
                                <input required="required" type="text"  value="" name="ubicacion">
                            </td>
                            <td>
                                <input type="text"  value="" name="texto">
                            </td>
                            <td>
                                <input required="required" type="text" pattern="[0-9]+" value="" name="cantidad">
                                <input type="hidden" name="id" value="${estampado.idestampado}" />
                            </td>
                            <td>
                                <input required="required" type="text" pattern="[12345]{1}" value="" name="rating">
                            </td>
                            <td>
                                <input required="required" type="text" value="" name="direccion">
                            </td>
                            <td>
                                <select name="forma_pago" required="true">
                                    <option>pago contra entrega</option>
                                    <option>consignacion</option>
                                    <option>transferencia</option>
                                </select>
                            </td>
                            <td>
                                <c:if   test="${not empty usuario.clientes}">
                                    <input type="submit" value="Confirmar Compra" />
                                </c:if>
                            </td>

                        </tr>

                    </table>
                </form>
                    </td>
            </tr>
            <c:if test="${!empty mensaje}">

                <tr>
                    <td colspan="2" style="text-align:left">
                        <span class="error smallText">
                            <br><span class="indent">${mensaje}</span>
                        </span>
                    </td>
                </tr>

            </c:if>
        </table>
        <%
            getServletContext().setAttribute("mensaje", null);
        %>
    </body>
</html>
