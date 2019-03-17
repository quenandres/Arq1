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
public class ArtistaDAO {


    private List<Tema> getTematicas() {
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
        session.save(estampa);
        session.flush();
        session.getTransaction().commit();
        try {
            session.close();
        } catch (Exception e) {
        }
    }

    public void actualizar_artista(Artista oArtista) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.saveOrUpdate(oArtista);
        session.flush();
        session.getTransaction().commit();
        try {
            session.close();
        } catch (Exception e) {
        }
    }
    
}
