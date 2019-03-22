<%-- 
    Document   : deporte
    Created on : 18/03/2019, 09:20:57 PM
    Author     : BOG-A209-E-019
--%>

<%@page import="proyecto.model.Jugadores"%>
<%@page import="proyecto.dao.JugadoresDAO"%>
<%@page import="proyecto.model.Equipos"%>
<%@page import="proyecto.dao.EquiposDAO"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="proyecto.dao.DeporteDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="proyecto.model.Deporte"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <script>
            function guardaDeporte() {
              alert("Deporte Guardado!");
              documen.getElementById("form_deporte").reset();
            }
            function guardaEquipo() {
              alert("Equipo Guardado!");
              documen.getElementById("form_equipo").reset();
            }
            function guardaJugador() {
              alert("Jugador Guardado!");
              documen.getElementById("form_jugador").reset();
            }
        </script>
        
    </head>
    <body>
        <%@ include file="menuadm.jsp" %>
        <form method="post" action="DeporteServlet" id="form_deporte">
        <table class="table table-striped" style="width:28%;margin:15px;float:left;">
            <tr>
                <td colspan="3"><b>Crear deporte</b></td>
            </tr>
            <tr>
                <th>Deporte</th>
                <td>
                    <input type="text" class="form-control" name="Deporte">
                </td>
                <td>
                    <input type="submit" value="Crear" onclick="guardaDeporte()" class="btn btn-primary"> 
                </td>
            </tr>
            
                    <%
                        
                        DeporteDAO dao = new DeporteDAO();
                        List<Deporte>list = dao.ListDeportes();
                        Iterator<Deporte>inter=list.iterator();
                        Deporte de = null;
                        
                        while(inter.hasNext()){
                            
                            de=inter.next();
                    %>        
                 
                 <tr>
                     <td><%= de.getIdDeporte() %></td>
                     <td><%= de.getDeporte()%></td>
                 </tr>
             </tbody>
                    
                    <%
                        
                        }
                        
                    %>
               
        </table>
        </form>
         
        <form id="form_equipo" method="post" action="EquipoServlet">
        <table class="table table-striped" style="width:28%;margin:15px;float:left;">
            <tr>
                <td colspan="3"><b>Crear equipo</b></td>
            </tr>
            
             <tr>
                <th>Deporte</th>
                <td>
                    <select name="Deporte" class="form-control">
                        
                        <% for(Deporte d : list) {%>
                 
                        <option value="<%= d.getIdDeporte()%>"><%=d.getDeporte()%></option>
                        
                        <%
                        }    
                        %>
                    </select>
                    
                    
                </td>
                <td rowspan="2">
                    <input type="submit" onclick="guardaEquipo();" value="Crear equipo" class="btn btn-primary" > 
                </td>
            </tr>
            <tr>
                <th>Nombre equipo</th>
                <td>
                    <input type="text" class="form-control" name="Equipo">
                </td>
                
            </tr>
            
            <tr>
                <td>
                    
                   <%
                        
                        EquiposDAO daoeq = new EquiposDAO();
                        List<Equipos>listeq = daoeq.ListEquipos();
                        Iterator<Equipos>intereq=listeq.iterator();
                        Equipos eq = null;
                        
                        while(intereq.hasNext()){
                            
                            eq=intereq.next();
                    %>
             <tbody>
                 
                 <tr>
                     <td><%= eq.getIdDeporte()%></td>
                     <td><%= eq.getNombreEquipo()%></td>
                 </tr>
             </tbody>
                    
                    <%
                        
                        }
                        
                    %> 
                </td>
            </tr>
           
                    
               
        </table>
        </form>
         
        <form id="form_jugador" method="post" action="JugadoresServlet">

        <table class="table table-striped" style="width:28%;margin:10px 0px;float:left;">
            <tr>
                <td colspan="3"><b>Crear jugador</b></td>
            </tr>
            
             <tr>
                <th>Equipo</th>
                <td>
                    
                    <select name="Equipo" class="form-control">
                        
                        <% for(Equipos e : listeq) {%>
                 
                        <option value="<%= e.getIdEquipos()%>"><%=e.getNombreEquipo()%></option>
                        
                        <%
                        }    
                        %>
                    </select>
                    
                </td>
                <td rowspan="2">
                   <input type="submit" onclick="guardaJugador();" value="Crear equipo" class="btn btn-primary"> 
                </td>
            </tr>
            <tr>
                <th>Nombre jugador</th>
                <td>
                    <input type="text" class="form-control" name="Jugador">
                </td>
            </tr>
            <tr>
                <td>
                    <%
                        
                        JugadoresDAO daoju = new JugadoresDAO();
                        List<Jugadores>listju = daoju.ListJugadores();
                        Iterator<Jugadores>interju=listju.iterator();
                        Jugadores ju = null;
                        
                        while(interju.hasNext()){
                            
                            ju=interju.next();
                    %>
             <tbody>
                 
                 <tr>
                     <td><%= ju.getIdJugadores()%></td>
                     <td><%= ju.getNombreJugador()%></td>
                 </tr>
             </tbody>
                    
                    <%                        
                        }                        
                    %>
                    
                </td> 
                
            </tr>
           
                    
        </table>
        </form>
    </body>
</html>
