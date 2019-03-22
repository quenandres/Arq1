/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import proyecto.dao.TorneoDAO;
import proyecto.model.Torneo;

/**
 *
 * @author quenan
 */
public class TorneosServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Nombre
        //EquipoParticipantes
        //FechaInicio
        //FechaFin
        //TorneoFaseFinal
        
        String nombre = request.getParameter("Nombre");         
        String equipoparticipantes = request.getParameter("EquipoParticipantes");         
        String fechainicio = request.getParameter("FechaInicio");         
        String fechafin = request.getParameter("FechaFin");         
        String torneofasefinal = request.getParameter("TorneoFaseFinal"); 
        //int equipo = Integer.parseInt(equipoGET);
        
        //System.out.println(nombre);
        
        
        Torneo oTorneo = new Torneo();  


        oTorneo.setNombreTorneo(nombre);         
        oTorneo.setIdEquipo(equipoparticipantes);
        //Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(fechainicioGET); 
        oTorneo.setFechaInicio(fechainicio);    
        //Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(fechafinGET);  
        oTorneo.setFechaFin(fechafin);
        oTorneo.setPartidosTorneo(torneofasefinal);   
        
        TorneoDAO oDao = new TorneoDAO();
        oDao.addTorneo(oTorneo);  
        
        
        response.sendRedirect("torneo.jsp");     
        return ;
        
    
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
