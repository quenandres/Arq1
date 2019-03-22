/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import proyecto.dao.DeporteDAO;
import proyecto.dao.EquiposDAO;
import proyecto.model.Deporte;
import proyecto.model.Equipos;

/**
 *
 * @author quenan
 */
public class EquipoServlet extends HttpServlet {

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
        
            String equipo = request.getParameter("Equipo");         
            String deporteGET = request.getParameter("Deporte");         
            int deporte = Integer.parseInt(deporteGET);


            Equipos oEquipos = new Equipos();  
            
            
            oEquipos.setIdDeporte(deporte);            
            oEquipos.setNombreEquipo(equipo);           
            EquiposDAO oDao = new EquiposDAO();
            oDao.addEquipos(oEquipos);     
            
            
            response.sendRedirect("deporte.jsp");
            
            
            
            /*ArrayList<Deporte> listadeportes = llenarDeporte();
            request.setAttribute("listaD", listadeportes);*/
            
            return;
        
       /* response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EquipoServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            response.sendRedirect("deporte.jsp");
            out.println("</body>");
            out.println("</html>");
        }*/
    }
    
    /*private ArrayList<Deporte> llenarDeporte(){
            
        ArrayList<Deporte> deportes =  new ArrayList<Deporte>();

        Deporte a = new Deporte();
        a.setDeporte("Futbol");
        
        Deporte a2 = new Deporte();
        a.setDeporte("Basketball");
        

        deportes.add(a);
        deportes.add(a2);
        return deportes;
     }*/

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
