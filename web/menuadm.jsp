<html>
    <table>
        <tr>
            <td>
                Crear Deporte (RF1)
                <!--RF1: Crear Deporte y asociar equipos y jugadores por equipo (siempre y cuando se hagan apuestas alrededor de los jugadores) --- admin -->
                <!-- 
                    Crear deporte
                        Crear equipos
                            Crear jugadores
                        Asociar equipo
                -->
            </td>
        </tr>
        <tr>
            <td>
                Crear Torneo (RF2)
                <!--RF2: Crear Torneo con los equipos que participan en el mismo, con fecha de inicio y fin del torneo. Al mismo tiempo, se debe definir una funcionalidad para que, en las finales de un torneo, se pueda configurar los diferentes partidos ANTES de iniciar la venta de la boletería. --- admin 
                    
                    Fecha de inicio
                    Fecha fin

                -->
            </td>
        </tr>
        <tr>
            <td>
                Crear Usuario (RF3)
                <!--RF3: Crear usuarios del sistema y definir perfil --- admin
                    
                -->
            </td>
        </tr>
        <tr>
            <td>
                Crear Apuesta (RF4)
                <!--RF4: Crear y definir apuesta: asociar deporte, partido, marcador. --- admin y vendedor boletas 
                    Crear apuesta
                        asociar deporte
                        asociar partido
                        partido
                        marcador
                -->
            </td>
        </tr>
        <tr>
            <td>
                Crear Rifa (RF5)
                <!--RF5: Crear y definir Rifa: definir máximo de participantes, premios, condiciones de ganador (gana con una lotería?, gana con el resultado de un juego?, etc). --- admin y vendedor boletas
                    
                RF11: Sorteo: para las rifas, uno de los eventos que definen al ganador es a través del sistema; por lo mismo, el sistema debe contar con un módulo que tenga conocimiento del rango de valores dentro de los que se realiza el sorteo y generar tantos números aleatorios como ganadores se hayan definido para cada rifa. --- admin 
                
                Crear rifa
                    definir maximo de participantes
                    definir premios
                    definir condiciones del ganador
                    con que resultado gana

                Sorteo de las rifas
                    modulo que tenga el rango de valores de los que se realiza el sorteo y definir numero aleatorios tanto los de la rifa.

                -->
            </td>
        </tr>

        <tr>
            <td>
                Venta boleteria (RF6-RF8)
                <!--RF6: Configuración boletería: Definir para un partido o rifa la cantidad máxima de boletas y el precio individual o si hay variabilidad, especificar (por ejemplo, pueden haber 3 tipos de boletas: $10.000, $20.000 y $30.000).    --- admin y vendedor boletas

                RF8: Venta boletería Apuesta: asociar a un apostador un marcador para un partido específico y un valor de apuesta. Además, el sistema debe permitir la venta de boletería hasta 5 minutos ANTES de que inicie el partido.    --- vendedor boletas
            
                
            
            
                -->
            </td>
        </tr>

        <tr>
            <td>
                Reportes (RF12)
                <!--RF12: publicación de ganadores: A discreción del administrador del sistema, se debe generar un reporte de los ganadores del día discriminados por tipo (Rifa o Apuesta) y por cada uno, discriminarlos por deporte, campeonato y partido. admin -->    
            </td>
        </tr>


        <!--RF14: Mostrar catálogo de Rifas y Apuestas: éste catálogo debe mostrar los eventos que estén disponibles para los usuarios apostadores. En el caso de las rifas, el sistema debe mostrar cuántas boletas se encuentran disponibles para dicha rifa. --- admin y vendedor boletas-->
    </table>
</html>