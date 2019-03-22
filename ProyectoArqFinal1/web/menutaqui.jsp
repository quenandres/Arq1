<!--RF6: ConfiguraciÃ³n boleterÃ­a: Definir para un partido o rifa la cantidad mÃ¡xima de boletas y el precio individual o si hay variabilidad, especificar (por ejemplo, pueden haber 3 tipos de boletas: $10.000, $20.000 y $30.000).    --- admin y vendedor boletas-->

            <!--RF8: Venta boleterÃ­a Apuesta: asociar a un apostador un marcador para un partido especÃ­fico y un valor de apuesta. AdemÃ¡s, el sistema debe permitir la venta de boleterÃ­a hasta 5 minutos ANTES de que inicie el partido.    --- vendedor boletas-->
            
            <%-- 
    Document   : deporte
    Created on : 18/03/2019, 09:20:57 PM
    Author     : BOG-A209-E-019
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            
        </style>
    </head>
    <table class="table table-bordered">
        <tr>
                   
            <td>
                <a href="apuesta.jsp">Crear Apuesta (RF4)</a>
                <!--RF4: Crear y definir apuesta: asociar deporte, partido, marcador. --- admin y vendedor boletas 
                    Crear apuesta
                        asociar deporte
                        asociar partido
                        partido
                        marcador
                -->
            </td>
        
        
            <td>
                <a href="boleteria.jsp">Venta boleteria (RF6-RF8)</a>
                <!--
                RF6: ConfiguraciÃ³n boleterÃ­a: Definir para un partido o rifa la cantidad mÃ¡xima de boletas y el precio individual o si hay variabilidad, especificar (por ejemplo, pueden haber 3 tipos de boletas: $10.000, $20.000 y $30.000).    --- admin y vendedor boletas

                RF8: Venta boleterÃ­a Apuesta: asociar a un apostador un marcador para un partido especÃ­fico y un valor de apuesta. AdemÃ¡s, el sistema debe permitir la venta de boleterÃ­a hasta 5 minutos ANTES de que inicie el partido.    --- vendedor boletas
            
                
            
            
                -->
            </td>
       
        </tr>

        <!--RF14: Mostrar catÃ¡logo de Rifas y Apuestas: Ã©ste catÃ¡logo debe mostrar los eventos que estÃ©n disponibles para los usuarios apostadores. En el caso de las rifas, el sistema debe mostrar cuÃ¡ntas boletas se encuentran disponibles para dicha rifa. --- admin y vendedor boletas-->
    </table>
</html>