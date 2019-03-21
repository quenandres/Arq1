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

    <!--RF2: Crear Torneo con los equipos que participan en el mismo, con fecha de inicio y fin del torneo. Al mismo tiempo, 
                se debe definir una funcionalidad para que, en las finales de un torneo, se pueda configurar los diferentes partidos ANTES de iniciar la venta de la boleterÃ­a. --- admin 
                    
                    Fecha de inicio
                    Fecha fin

                -->
    <form action="" method="">
        <table class="table table-striped" style="width:50%;margin:auto;">
            <tr>
                <td style="text-align:left;" colspan="2"><b>Creacion de Torneos</b></td>
            </tr>
            <tr>
                <td>Descripcion Torneo</td>
                <td>
                    <textarea class="form-control" name="descripciontorneo"></textarea>
                </td>
            </tr>    
            <tr>
                <td>Equipos participantes</td>
                <td>
                    <!-- Equipos en seelct multiple -->
                    <select class="form-control"></select>
                </td>
            </tr>
            <tr>
                <td>Fecha inicio</td>
                <td><input class="form-control" type="date" name="fecha_inicio"></td>
            </tr>
            <tr>
                <td>Fecha fin</td>
                <td><input class="form-control" type="date" name="fecha_fin"></td>
            </tr>
            <tr>
                <td>Torneo fase final</td>
                <td>
                    <select class="form-control" name="fase_final">
                        <option value="si">Si</option>
                        <option value="no">No</option>
                    </select>
                </td>
            </tr>   
        </table>

        <table class="table table-striped" style="width:80%;margin:auto;margin:auto;">
            <tr>
                <td><input type="submit" value="Guardar" class="btn btn-primary" style="display:block;margin:auto;"></td>
                <td><input type="reset" value="Cancelar" class="btn btn-primary" style="display:block;margin:auto;"></td>
            </tr>
        </table>
    </form>
</body>

</html>