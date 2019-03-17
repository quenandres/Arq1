/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Hibernate.Artista;
import Hibernate.Cliente;
import Hibernate.Estampado;
import Hibernate.HibernateUtil;
import Hibernate.Tema;
import Hibernate.Usuario;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Administrator
 */
public class AdministradorDAO {

    public Usuario autentica(String user, String password) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();

        session.beginTransaction();
        session.clear();
        Criteria q = session.createCriteria(Usuario.class)
                .add(Restrictions.eq("usuario", user))
                .add(Restrictions.eq("password", password));

        try {
            Usuario usuario = (Usuario) q.uniqueResult();

            if (usuario == null) {
                return null;
            }
            return (Usuario) usuario;
        } catch (Exception e) {
        } finally {
            session.close();
        }

        return null;

    }

    public List<Usuario> getUsuarios() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();

        List<Usuario> usuarios = new ArrayList<>();
        try {
            session.beginTransaction();
            Query q = session.createQuery("From Usuario");

            usuarios = (List<Usuario>) q.list();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            session.close();
        }
        return usuarios;

    }

    public void agregar_artista(Artista oArtista) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(oArtista.getUsuario());
        session.save(oArtista);
        session.flush();
        session.getTransaction().commit();
        try {
            session.close();
        } catch (Exception e) {
        }
    }
    public void agregar_cliente(Cliente oCliente) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(oCliente.getUsuario());
        session.save(oCliente);
        session.flush();
        session.getTransaction().commit();
        try {
            session.close();
        } catch (Exception e) {
        }
    }

    public List<Tema> getTematicas() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        List<Tema> temas = new ArrayList<>();
        try {
            session.beginTransaction();

            Query q = session.createQuery("From Tema");

            temas = (List<Tema>) q.list();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            session.close();
        }
        return temas;
    }

    public void agregar_tematica(Tema tematica) 
    {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(tematica);
        session.flush();
        session.getTransaction().commit();
        try {
            session.close();
        } catch (Exception e) {
        }
    }

    public void agregar_estampa(Estampado estampa) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.saveOrUpdate(estampa);
        session.flush();
        session.getTransaction().commit();
        try {
            session.close();
        } catch (Exception e) {
        }
    }

    public List<Estampado> getEstampados() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        List catalogo = null;
        try {

            session.beginTransaction();
            session.flush();
            session.clear();
            Query q = session.createQuery("FROM Estampado");
            catalogo =  q.list();
        } catch (Exception e) {
        } finally {
            session.close();
        }
        return catalogo;
    }
    public Tema getTema(Integer id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Tema tema = null;
        try {

            session.beginTransaction();
            session.flush();
            session.clear();
            tema = (Tema) session.get(Tema.class,id);
        } catch (Exception e) {
        } finally {
            session.close();
        }
        return tema;
    }
}
