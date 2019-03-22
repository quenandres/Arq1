/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.dao;

import java.util.ArrayList;
import java.util.List;
import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import proyecto.model.Deporte;
import proyecto.util.NewHibernateUtil;



/**
 *
 * @author quenan
 */
public class DeporteDAO {
    public void addDeporte(Deporte deporte){
    
        Transaction tx = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            tx = session.beginTransaction();
            session.save(deporte);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            if(tx != null){
                tx.rollback();
            }
        }finally{
            session.flush();
            session.close();
        }
        
    }
    
    public List<Deporte> ListDeportes() {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        List<Deporte> deportes = new ArrayList<>();
        try {
            session.beginTransaction();

            Query q = session.createQuery("From Deporte");

            deportes = (List<Deporte>) q.list();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            session.close();
        }
        return deportes;
    }
}
