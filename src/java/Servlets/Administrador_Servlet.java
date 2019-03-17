/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Dao.AdministradorDAO;
import Hibernate.Artista;
import Hibernate.Cliente;
import Hibernate.Tema;
import Hibernate.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Administrator
 */
public class Administrador_Servlet extends HttpServlet {

    /**
     * POST
     */
    private final String autenticar = "/autenticar";
    private final String nuevo_usuarios = "/BackEnd/usuarios/nuevo";
    private final String nueva_tematicas = "/BackEnd/tematicas/nuevo";
    private final String registrar = "/registrar";
    /**
     * GET
     */
    private final String login = "/login";
    private final String salir = "/salir";
    private final String request_usuarios = "/BackEnd/usuarios";
    private final String request_tematicas = "/BackEnd/tematicas";

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
        HttpSession session = request.getSession();

        if (request.getServletPath().equalsIgnoreCase(login)) {
            request.getRequestDispatcher("/login.jsp").forward(request, response);
            return;
        }
        if (request.getServletPath().equalsIgnoreCase(salir)) {
            session.setAttribute("usuario", null);
            request.getRequestDispatcher("/login.jsp").forward(request, response);
            return;
        }
        if (request.getServletPath().equalsIgnoreCase(autenticar)) {
            String sUsuario = request.getParameter("usuario");
            String sContraseña = request.getParameter("password");
            if ("".equals(sUsuario) || "".equals(sContraseña)) {
                request.getRequestDispatcher("/login.jsp").forward(request, response);
                return;
            }
        // cambiar la aontraseña y el usuario del administrador
            if ("admin".equals(sUsuario) && "admin".equals(sContraseña)) {
                Usuario admin = new Usuario();
                admin.setUsuario("admin");
                session.setAttribute("usuario", admin);
                request.getRequestDispatcher("/BackEnd/index.jsp").forward(request, response);
                return;
            }
            AdministradorDAO dao = new AdministradorDAO();
            Usuario usuario = dao.autentica(sUsuario, sContraseña);
            if (usuario == null) {
                getServletContext().setAttribute("mensaje", "Credenciales invalidas");
                request.getRequestDispatcher("/login.jsp").forward(request, response);
                return;
            }
            //
            session.setAttribute("usuario", usuario);
            if (!usuario.getArtistas().isEmpty()) {
                request.getRequestDispatcher("/Artistas/index.jsp").forward(request, response);
            }else{
                response.sendRedirect(response.encodeRedirectURL(getServletContext().getContextPath() + "/Catalogo"));
            }
            return;
        }
        if (request.getServletPath().equalsIgnoreCase(request_usuarios)) {
            AdministradorDAO oDao = new AdministradorDAO();
            List<Usuario> misUsuarios = oDao.getUsuarios();
            getServletContext().setAttribute("Usuarios", misUsuarios);
            request.getRequestDispatcher("/BackEnd/usuarios.jsp").forward(request, response);
            return;

        }

        if (request.getServletPath().equalsIgnoreCase(nuevo_usuarios)) {
            String sUsuario = request.getParameter("usuario");
            String sContraseña = request.getParameter("password");
            String nombre = request.getParameter("nombre");
            String telefono = request.getParameter("telefono");
            String direccion = request.getParameter("direccion");

            Artista oArtista = new Artista();
            oArtista.setUsuario(new Usuario());
            oArtista.setNombre(nombre);
            oArtista.setTelefono(telefono);
            oArtista.setDireccion(direccion);
            oArtista.getUsuario().setUsuario(sUsuario);
            oArtista.getUsuario().setPassword(sContraseña);

            AdministradorDAO oDao = new AdministradorDAO();

            oDao.agregar_artista(oArtista);

            response.sendRedirect(response.encodeRedirectURL(getServletContext().getContextPath() + request_usuarios));
            return;

        }
        if (request.getServletPath().equalsIgnoreCase(registrar)) {
            String sUsuario = request.getParameter("usuario");
            String sContraseña = request.getParameter("password");
            String nombre = request.getParameter("nombre");
            String telefono = request.getParameter("telefono");
            String direccion = request.getParameter("direccion");

            Cliente oCliente = new Cliente();
            oCliente.setUsuario(new Usuario());
            oCliente.setNombre(nombre);
            oCliente.setTelefono(telefono);
            oCliente.setDireccion(direccion);
            oCliente.getUsuario().setUsuario(sUsuario);
            oCliente.getUsuario().setPassword(sContraseña);

            AdministradorDAO oDao = new AdministradorDAO();

            oDao.agregar_cliente(oCliente);
            getServletContext().setAttribute("mensaje", "Usuario Registrado Correctamente");
            response.sendRedirect(response.encodeRedirectURL(getServletContext().getContextPath() + login));
            return;

        }
        

        if (request.getServletPath().equalsIgnoreCase(request_tematicas)) {
            AdministradorDAO oDao = new AdministradorDAO();
            getServletContext().setAttribute("tematicas",  oDao.getTematicas());
            request.getRequestDispatcher("/BackEnd/tematicas.jsp").forward(request, response);
            return;

        }
        if (request.getServletPath().equalsIgnoreCase(nueva_tematicas)) {
            String nombre = request.getParameter("tematica");
            Tema tematica = new Tema();
            tematica.setNombre(nombre);
            AdministradorDAO oDao = new AdministradorDAO();
            oDao.agregar_tematica(tematica);

            response.sendRedirect(response.encodeRedirectURL(getServletContext().getContextPath() + request_tematicas));
            return;

        }

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Administrador</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Administrador</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
