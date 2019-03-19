<%-- 
    Document   : usuario
    Created on : 18/03/2019, 09:28:16 PM
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
       <!--RF3: Crear usuarios del sistema y definir perfil --- admin-->

        <table border="1">
            <tr>
                <td colspan="2"><b>Crear usuario</b></td>
            </tr>
            <tr>
                <th>Nombre usuario</th>
                <td>
                    <input type="text" name="nombreusuario">
                </td>
            </tr>
            <tr>
                <th>Perfil de usuario</th>
                <td>
                    <select name="perfilusuario">
                        <option>Admin</option>
                        <option>Taquillero</option>
                    </select>
                </td>
            </tr>
        </table>
    </body>
</html>
