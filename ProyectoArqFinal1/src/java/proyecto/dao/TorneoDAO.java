/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import proyecto.model.Jugadores;
import proyecto.model.Torneo;
import proyecto.util.NewHibernateUtil;

/**
 *
 * @author quenan
 */
public class TorneoDAO {
    public void addTorneo(Torneo torneo){
    
        Transaction tx = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            tx = session.beginTransaction();
            session.save(torneo);
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
}
