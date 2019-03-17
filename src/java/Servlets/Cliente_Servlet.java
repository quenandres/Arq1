package Servlets;

import Dao.AdministradorDAO;
import Dao.ClienteDAO;
import Hibernate.Cliente;
import Hibernate.Compra;
import Hibernate.CompraHasEstampado;
import Hibernate.Estampado;
import Hibernate.Usuario;
import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Cliente_Servlet extends HttpServlet {

    /**
     * POST
     */
    private final String registrar_cambios = "/registrar/cambios";

    /**
     * GET
     */
    private final String catalogo = "/Catalogo";
    private final String comprar = "/Comprar";
    private final String perfil = "/Perfil";
    private final String comprar_confirmar = "/Comprar/confirmar";

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

        session = request.getSession();
        Usuario usuario = (Usuario) session.getAttribute("usuario");

        if (request.getServletPath().equalsIgnoreCase(catalogo)) {
            AdministradorDAO oDAO = new AdministradorDAO();
            getServletContext().setAttribute("catalogo", oDAO.getEstampados());

            request.getRequestDispatcher("/catalogo.jsp").forward(request, response);
            return;

        }

        //Evita accesso a Usuarios no autenticados">
        if (usuario == null) {
            response.sendRedirect(response.encodeRedirectURL(getServletContext().getContextPath() + "/login"));
            return;
        }

        if (request.getServletPath().equalsIgnoreCase(comprar)) {
            ClienteDAO oDAO = new ClienteDAO();
            String id = request.getParameter("id");
            getServletContext().setAttribute("estampado", oDAO.getEstampado(Integer.parseInt(id)));
            request.getRequestDispatcher("/comprar.jsp").forward(request, response);
            return;
        }
        if (request.getServletPath().equalsIgnoreCase(perfil)) {
            request.getRequestDispatcher("/perfil.jsp").forward(request, response);
            return;
        }
        if (request.getServletPath().equalsIgnoreCase(registrar_cambios)) {

            String nombre = request.getParameter("nombre");
            String telefono = request.getParameter("telefono");
            String direccion = request.getParameter("direccion");

            Cliente oCliente = (Cliente) usuario.getClientes().toArray()[0];
            oCliente.setNombre(nombre);
            oCliente.setTelefono(telefono);
            oCliente.setDireccion(direccion);

            ClienteDAO oDao = new ClienteDAO();

            oDao.actualizar_cliente(oCliente);
            getServletContext().setAttribute("mensaje", "Usuario actualizado Correctamente");
            response.sendRedirect(response.encodeRedirectURL(getServletContext().getContextPath() + perfil));
            return;

        }
        if (request.getServletPath().equalsIgnoreCase(comprar_confirmar)) {
            ClienteDAO oDAO = new ClienteDAO();
            String id = request.getParameter("id");
            String cantidad = request.getParameter("cantidad");
            String tono = request.getParameter("tono");
            String talla = request.getParameter("talla");
            String estilo = request.getParameter("estilo");
            String ubicacion = request.getParameter("ubicacion");
            String texto = request.getParameter("texto");
            String rating = request.getParameter("rating");

            Estampado estampado = oDAO.getEstampado(Integer.parseInt(id));
            CompraHasEstampado compra_estampado = new CompraHasEstampado();
            compra_estampado.setCantidad(Integer.parseInt(cantidad));
            compra_estampado.setTono(tono);
            compra_estampado.setTalla(talla);
            compra_estampado.setUbicacion(ubicacion);
            compra_estampado.setEstilo(estilo);
            compra_estampado.setTexto(texto);
            compra_estampado.setEstampado(estampado);
            compra_estampado.setRating(Integer.parseInt(rating));
            Compra compra = new Compra();
            compra.setCliente((Cliente) usuario.getClientes().toArray()[0]);
            compra.getCompraHasEstampados().add(compra_estampado);

            oDAO.realizarCompra(compra);
            getServletContext().setAttribute("mensaje", "Transaccion realizada.");

            response.sendRedirect(response.encodeRedirectURL(getServletContext().getContextPath() + catalogo));

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
