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
    
    <!--RF2: Crear Torneo con los equipos que participan en el mismo, con fecha de inicio y fin del torneo. Al mismo tiempo, 
                se debe definir una funcionalidad para que, en las finales de un torneo, se pueda configurar los diferentes partidos ANTES de iniciar la venta de la boleterÃ­a. --- admin 
                    
                    Fecha de inicio
                    Fecha fin

                -->
<table>
    <tr>
        <td style="text-align:left;" colspan="2"><b>Creacion de Torneos</b></td>
    </tr>
    <tr>
        <td>Descripcion Torneo</td>
        <td>
            <textarea name="descripciontorneo"></textarea>
        </td>
    </tr>
</table>


<table>
    <tr>
        <td>Equipos participantes</td>
        <td>
            <!-- Equipos en seelct multiple -->
            <select></select>
        </td>
    </tr>
    <tr>
        <td>Fecha inicio</td>
        <td><input type="date" name="fecha_inicio"></td>
    </tr>
    <tr>
        <td>Fecha fin</td>
        <td><input type="date" name="fecha_fin"></td>
    </tr>
    <tr>
        <td>Torneo fase final</td>
        <td>
            <select name="fase_final">
                <option value="si">Si</option>
                <option value="no">No</option>
            </select>
        </td>
    </tr>   
</table>

<table>
    <tr>
        <td><input type="submit" value="Guardar"></td>
    </tr>
</table>



</body>

</html>