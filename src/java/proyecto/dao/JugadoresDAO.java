/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import proyecto.model.Equipos;
import proyecto.model.Jugadores;
import proyecto.util.NewHibernateUtil;

/**
 *
 * @author quenan
 */
public class JugadoresDAO {
    public void addJugadores(Jugadores jugadores){
    
        Transaction tx = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            tx = session.beginTransaction();
            session.save(jugadores);
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
    public List<Jugadores> ListJugadores() {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        List<Jugadores> jugadores = new ArrayList<>();
        try {
            session.beginTransaction();

            Query q = session.createQuery("From Jugadores");

            jugadores = (List<Jugadores>) q.list();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            session.close();
        }
        return jugadores;
    }
}
