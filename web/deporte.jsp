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
        <table border="1">
            <tr>
                <td colspan="2"><b>Crear deporte</b></td>
            </tr>
            <tr>
                <th>Deporte</th>
                <td>
                    <input type="text" name="nombredeporte">
                </td>
            </tr>
        </table>
        
        <table border="1">
            <tr>
                <td colspan="2"><b>Crear equipo</b></td>
            </tr>
            
             <tr>
                <th>Deporte</th>
                <td>
                    <select name="deporteequipo"></select>
                </td>
            </tr>
            <tr>
                <th>Nombre equipo</th>
                <td>
                    <input type="text" name="nombreequipo">
                </td>
            </tr>
        </table>
        
        <table border="1">
            <tr>
                <td colspan="2"><b>Crear jugador</b></td>
            </tr>
            
             <tr>
                <th>Deporte</th>
                <td>
                    <select name="equipojugador"></select>
                </td>
            </tr>
            <tr>
                <th>Nombre jugador</th>
                <td>
                    <input type="text" name="nombrejugador">
                </td>
            </tr>
        </table>
    </body>
</html>
