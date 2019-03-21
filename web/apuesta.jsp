<%-- 
    Document   : apuesta
    Created on : 18/03/2019, 09:30:04 PM
    Author     : BOG-A209-E-019
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%@ include file="menuadm.jsp" %>
        
        <!--RF4: Crear y definir apuesta: asociar deporte, partido, marcador. --- admin y vendedor boletas 
                    Crear apuesta
                        asociar deporte
                        asociar partido
                        partido
                        marcador
                -->
        <table class="table table-striped" style="width:50%;margin:auto;">
            <tr>
                <td colspan="3"><b>Crear apuesta</b></td>
            </tr>
            <tr>
                <th>Deporte</th>
                <td colspan="2">
                    <select class="form-control" name="deporteapuesta">
                        <option>Admin</option>
                        <option>Taquillero</option>
                    </select>    
                </td>
            </tr>
            <tr>
                <th>Asociar partido</th>
                <td colspan="2">
                    <select class="form-control" name="partidoapuesta">
                        <option>Admin</option>
                        <option>Taquillero</option>
                    </select>
                </td>
            </tr>
            <tr>
                <th>Marcador</th>
                <td>
                    <input class="form-control" type="number" min="0" max="300" value="0" name="marcador1">
                </td>
                <td>
                    <input class="form-control" type="number" min="0" max="300" value="0" name="marcador2">
                </td>
            </tr>
            <tr>
                <td colspan="3">
                    <input type="button" value="Guardar" style="display:block;margin:auto;" class="btn btn-primary">
                </td>
            </tr>
        </table>
    </body>
</html>
