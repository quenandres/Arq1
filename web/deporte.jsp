<%-- 
    Document   : deporte
    Created on : 18/03/2019, 09:20:57 PM
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

        <table class="table table-striped" style="width:28%;margin:15px;float:left;">
            <tr>
                <td colspan="3"><b>Crear deporte</b></td>
            </tr>
            <tr>
                <th>Deporte</th>
                <td>
                    <input type="text" class="form-control" name="nombredeporte">
                </td>
                <td>
                    <input type="submit" value="Crear" class="btn btn-primary"> 
                </td>
            </tr>
        </table>
        
        <table class="table table-striped" style="width:28%;margin:15px;float:left;">
            <tr>
                <td colspan="3"><b>Crear equipo</b></td>
            </tr>
            
             <tr>
                <th>Deporte</th>
                <td>
                    <select class="form-control" name="deporteequipo"></select>
                </td>
                <td rowspan="2">
                    <input type="submit" value="Crear equipo" class="btn btn-primary" > 
                </td>
            </tr>
            <tr>
                <th>Nombre equipo</th>
                <td>
                    <input type="text" class="form-control" name="nombreequipo">
                </td>
            </tr>
        </table>
        
        <table class="table table-striped" style="width:28%;margin:10px 0px;float:left;">
            <tr>
                <td colspan="3"><b>Crear jugador</b></td>
            </tr>
            
             <tr>
                <th>Deporte</th>
                <td>
                    <select class="form-control" name="equipojugador"></select>
                </td>
                <td rowspan="2">
                   <input type="submit" value="Crear equipo" class="btn btn-primary"> 
                </td>
            </tr>
            <tr>
                <th>Nombre jugador</th>
                <td>
                    <input type="text" class="form-control" name="nombrejugador">
                </td>
            </tr>
        </table>
    </body>
</html>
