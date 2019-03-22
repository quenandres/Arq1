<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
         <script>
            function guardaBoleteria() {
              alert("Guardado!");
              documen.getElementById("form_boletas").reset();
            }
            
        </script>
    </head>
    <body>

        <%@ include file="menuadm.jsp" %>

    <!--RF2: Crear Torneo con los equipos que participan en el mismo, con fecha de inicio y fin del torneo. Al mismo tiempo, 
                se debe definir una funcionalidad para que, en las finales de un torneo, se pueda configurar los diferentes partidos ANTES de iniciar la venta de la boleterÃ­a. --- admin 
                    
                    Fecha de inicio
                    Fecha fin

                -->
    <form id="form_boletas" method="post" action="BoleteriaServlet" >
        <table class="table table-striped" style="width:50%;margin:auto;">
            <tr>
                <td style="text-align:left;" colspan="2"><b>Venta de boleteria</b></td>
            </tr>
            <tr>
                <td>Cantidad Boletas</td>
                <td>
                    <input type="number" class="form-control" min="0" max="6" name="maxBoletas">
                </td>
            </tr>    
            <tr>
                <td>Precio</td>
                <td>
                    <select class="form-control" name="precioBoletas">
                        <option value="10000">$10.000</option>
                        <option value="20000">$20.000</option>
                        <option value="30000">$30.000</option>

                    </select>
                </td>
            </tr>
            <tr>
                <td>Tipo</td>
                <td>
                    <select class="form-control" name="tipoBoleta">
                        <option value="partido">Partido</option>
                        <option value="rifa">Rifa</option>

                    </select>
                </td>
            </tr>
             
        </table>

        <table class="table table-striped" style="width:80%;margin:auto;margin:auto;">
            <tr>
                <td><input type="submit" onclick="guardaTorneo();" value="Guardar" class="btn btn-primary" style="display:block;margin:auto;"></td>
                <td><input type="reset" value="Cancelar" class="btn btn-primary" style="display:block;margin:auto;"></td>
            </tr>
        </table>
    </form>
</body>

</html>