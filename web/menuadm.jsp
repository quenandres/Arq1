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
                <a href="deporte.jsp">Crear Deporte (RF1)</a>
                <!--RF1: Crear Deporte y asociar equipos y jugadores por equipo (siempre y cuando se hagan apuestas alrededor de los jugadores) --- admin -->
                <!-- 
                    Crear deporte
                        Crear equipos
                            Crear jugadores
                        Asociar equipo
                -->
            </td>
       
            <td>
                <a href="torneo.jsp">Crear Torneo (RF2)</a>
                <!--RF2: Crear Torneo con los equipos que participan en el mismo, con fecha de inicio y fin del torneo. Al mismo tiempo, se debe definir una funcionalidad para que, en las finales de un torneo, se pueda configurar los diferentes partidos ANTES de iniciar la venta de la boleterÃ­a. --- admin 
                    
                    Fecha de inicio
                    Fecha fin

                -->
            </td>
        
            <td>
                <a href="usuario.jsp">Crear Usuario (RF3)</a>
                <!--RF3: Crear usuarios del sistema y definir perfil --- admin
                    
                -->
            </td>
        
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
                <a href="rifa.jsp">Crear Rifa (RF5)</a>
                <!--RF5: Crear y definir Rifa: definir mÃ¡ximo de participantes, premios, condiciones de ganador (gana con una loterÃ­a?, gana con el resultado de un juego?, etc). --- admin y vendedor boletas
                    
                RF11: Sorteo: para las rifas, uno de los eventos que definen al ganador es a travÃ©s del sistema; por lo mismo, el sistema debe contar con un mÃ³dulo que tenga conocimiento del rango de valores dentro de los que se realiza el sorteo y generar tantos nÃºmeros aleatorios como ganadores se hayan definido para cada rifa. --- admin 
                
                Crear rifa
                    definir maximo de participantes
                    definir premios
                    definir condiciones del ganador
                    con que resultado gana

                Sorteo de las rifas
                    modulo que tenga el rango de valores de los que se realiza el sorteo y definir numero aleatorios tanto los de la rifa.

                -->
            </td>
        
            <td>
                <a href="boleteria.jsp">Venta boleteria (RF6-RF8)</a>
                <!--RF6: ConfiguraciÃ³n boleterÃ­a: Definir para un partido o rifa la cantidad mÃ¡xima de boletas y el precio individual o si hay variabilidad, especificar (por ejemplo, pueden haber 3 tipos de boletas: $10.000, $20.000 y $30.000).    --- admin y vendedor boletas

                RF8: Venta boleterÃ­a Apuesta: asociar a un apostador un marcador para un partido especÃ­fico y un valor de apuesta. AdemÃ¡s, el sistema debe permitir la venta de boleterÃ­a hasta 5 minutos ANTES de que inicie el partido.    --- vendedor boletas
            
                
            
            
                -->
            </td>
       
            <td>
                <a href="reportes.jsp">Reportes (RF12)</a>
                <!--RF12: publicaciÃ³n de ganadores: A discreciÃ³n del administrador del sistema, se debe generar un reporte de los ganadores del dÃ­a discriminados por tipo (Rifa o Apuesta) y por cada uno, discriminarlos por deporte, campeonato y partido. admin -->    
            </td>
        </tr>


        <!--RF14: Mostrar catÃ¡logo de Rifas y Apuestas: Ã©ste catÃ¡logo debe mostrar los eventos que estÃ©n disponibles para los usuarios apostadores. En el caso de las rifas, el sistema debe mostrar cuÃ¡ntas boletas se encuentran disponibles para dicha rifa. --- admin y vendedor boletas-->
    </table>
</html>