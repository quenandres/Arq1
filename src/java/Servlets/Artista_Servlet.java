package Servlets;

import Dao.AdministradorDAO;
import Dao.ArtistaDAO;
import Dao.ClienteDAO;
import Hibernate.Artista;
import Hibernate.Estampado;
import Hibernate.Usuario;
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Artista_Servlet extends HttpServlet {

    /**
     * POST
     */
    private final String nuevo_estampados = "/Artistas/estampados/nuevo";
    private final String perfil_cambios = "/Artistas/cambios";

    /**
     * GET
     */
    private final String request_estampados = "/Artistas/estampados";
    private final String perfil = "/Artistas/Perfil";

    HttpSession session;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

        super.init(servletConfig);
    }

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
        request.setCharacterEncoding("UTF-8");
        String userPath = request.getServletPath();

        session = request.getSession();
        Usuario usuario = (Usuario) session.getAttribute("usuario");

        //Evita accesso a Usuarios no autenticados">
        if (usuario == null) {
            response.sendRedirect(response.encodeRedirectURL(getServletContext().getContextPath() + "/login"));
            return;
        }
        if (request.getServletPath().equalsIgnoreCase(perfil)) {
            request.getRequestDispatcher("/Artistas/perfil.jsp").forward(request, response);
            return;
        }
        if (request.getServletPath().equalsIgnoreCase(perfil_cambios)) {

            String nombre = request.getParameter("nombre");
            String telefono = request.getParameter("telefono");
            String direccion = request.getParameter("direccion");

            Artista oArtista = (Artista) usuario.getArtistas().toArray()[0];
            oArtista.setNombre(nombre);
            oArtista.setTelefono(telefono);
            oArtista.setDireccion(direccion);

            ArtistaDAO oDao = new ArtistaDAO();
            oDao.actualizar_artista(oArtista);
            getServletContext().setAttribute("mensaje", "Artista actualizado Correctamente");
            response.sendRedirect(response.encodeRedirectURL(getServletContext().getContextPath() + perfil));
            return;

        }

        if (request.getServletPath().equalsIgnoreCase(request_estampados)) {
            String id = request.getParameter("id");
            if (id != null) {
                ClienteDAO oDAO = new ClienteDAO();
                getServletContext().setAttribute("estampado", oDAO.getEstampado(Integer.parseInt(id)));
            }
            AdministradorDAO oDao = new AdministradorDAO();
            getServletContext().setAttribute("tematicas", oDao.getTematicas());
            request.getRequestDispatcher("/Artistas/estampados.jsp").forward(request, response);
            return;

        }
        if (request.getServletPath().equalsIgnoreCase(nuevo_estampados)) {
            String nombre = request.getParameter("nombre");
            String descripcion = request.getParameter("descripcion");
            String valor = request.getParameter("valor");
            String id = request.getParameter("id");
            String tematica = request.getParameter("tematica");
            String popularidad = request.getParameter("popularidad");
            Estampado estampa = new Estampado();
            try {
                estampa.setIdestampado(Integer.parseInt(id));
                estampa.setPopularidad(Integer.parseInt(popularidad));
            } catch (Exception e) {
            }
            estampa.setNombre(nombre);
            estampa.setDescripcion(descripcion);
            estampa.setValor(Integer.parseInt(valor));
            estampa.setArtista((Artista) usuario.getArtistas().toArray()[0]);
            AdministradorDAO dao = new AdministradorDAO();
            estampa.getTemas().add(dao.getTema(Integer.parseInt(tematica)));
            dao.agregar_estampa(estampa);
            //actualiza el artista
            usuario = dao.autentica(usuario.getUsuario(), usuario.getPassword());
            session.setAttribute("usuario", usuario);
            response.sendRedirect(response.encodeRedirectURL(getServletContext().getContextPath() + request_estampados));

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
    // </editor-fold>

}
