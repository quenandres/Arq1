<%-- 
    Document   : rifa
    Created on : 18/03/2019, 09:36:53 PM
    Author     : BOG-A209-E-019
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
         <script>
            function guardaRifa() {
              alert("Torneo Guardado!");
              documen.getElementById("form_rifa").reset();
            }
            
        </script>
    </head>
    <body>
         <%@ include file="menuadm.jsp" %>

        <!--RF5: Crear y definir Rifa: definir mÃ¡ximo de 
                    participantes, 
                    premios, 
                    condiciones de ganador (gana con una loterÃ­a?, gana con el resultado de un juego?, etc). --- admin y vendedor boletas
                    
                RF11: Sorteo: para las rifas, uno de los eventos que definen al ganador es a travÃ©s del sistema; por lo mismo, 
                el sistema debe contar con un mÃ³dulo que tenga conocimiento del rango de valores dentro de los que se realiza el sorteo y generar 
                tantos nÃºmeros aleatorios como ganadores se hayan definido para cada rifa. --- admin 
                
                Crear rifa
                    definir maximo de participantes
                    definir premios
                    definir condiciones del ganador
                    con que resultado gana

                Sorteo de las rifas
                    modulo que tenga el rango de valores de los que se realiza el sorteo y definir numero aleatorios tanto los de la rifa.

                -->
   
      <form id="form_torneo" method="post" action="RifaServlet" >

        <table class="table table-striped" style="width:50%;margin:auto;">
            <tr>
                <td colspan="2"><b>Crear rifa</b></td>
            </tr>
            <tr>
                <th>Participantes</th>
                <td>
                    <input class="form-control" type="number" min="0" max="300" value="0" name="participantesrifa">
                </td>
            </tr>
            <tr>
                <th>Premios</th>
                <td>
                    <textarea class="form-control" name="premios"></textarea>
                </td>
            </tr>
            <tr>
                <th>Condiciones</th>
                <td>
                    <textarea class="form-control" name="condiciones"></textarea>
                </td>
            </tr>            
            <tr>
                <td colspan="2">
                    <input type="submit" onclick="guardaRifa();" value="Guardar" style="display:block;margin:auto;" class="btn btn-primary">
                </td>
            </tr>
        </table>
      </form>
    </body>
</html>
