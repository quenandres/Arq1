/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import proyecto.model.Boleteria;
import proyecto.model.Deporte;
import proyecto.util.NewHibernateUtil;

/**
 *
 * @author quenan
 */
public class BoleteriaDAO {
    public void addBoleteria(Boleteria boleteria){
    
        Transaction tx = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            tx = session.beginTransaction();
            session.save(boleteria);
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
