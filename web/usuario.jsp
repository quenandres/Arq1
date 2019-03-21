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

        <%@ include file="menuadm.jsp" %>

       <!--RF3: Crear usuarios del sistema y definir perfil --- admin-->

        <table class="table table-striped" style="width:60%;margin:auto;">
            <tr>
                <td colspan="2"><b>Crear usuario</b></td>
            </tr>
            <tr>
                <th>Nombre usuario</th>
                <td>
                    <input class="form-control" type="text" name="nombreusuario">
                </td>
            </tr>
            <tr>
                <th>Perfil de usuario</th>
                <td>
                    <select class="form-control" name="perfilusuario">
                        <option>Admin</option>
                        <option>Taquillero</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Guardar" class="btn btn-primary" style="display:block;margin:auto;">
                </td>
            </tr>
        </table>
    </body>
</html>
