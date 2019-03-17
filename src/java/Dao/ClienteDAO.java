/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Hibernate.Artista;
import Hibernate.Cliente;
import Hibernate.Compra;
import Hibernate.CompraHasEstampado;
import Hibernate.CompraHasEstampadoId;
import Hibernate.Estampado;
import Hibernate.HibernateUtil;
import Hibernate.Tema;
import Hibernate.Usuario;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Administrator
 */
public class ClienteDAO {

   public Estampado getEstampado(Integer id) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Estampado catalogo = null;
        try {

            session.beginTransaction();
            session.flush();
            session.clear();
            catalogo =  (Estampado) session.get(Estampado.class,id);
        } catch (Exception e) {
        } finally {
            session.close();
        }
        return catalogo;
    }

    public void realizarCompra(Compra compra) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(compra);
        for (Iterator iterator = compra.getCompraHasEstampados().iterator(); iterator.hasNext();) {
            CompraHasEstampado next = (CompraHasEstampado) iterator.next();
            next.setCompra(compra);
            next.setId(new CompraHasEstampadoId(compra.getIdcompra(), next.getEstampado().getIdestampado()));
            session.save(next);
        }
        session.flush();
        session.getTransaction().commit();
        try {
            session.close();
        } catch (Exception e) {
        }
    }

    public void actualizar_cliente(Cliente oCliente) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.saveOrUpdate(oCliente);
        session.flush();
        session.getTransaction().commit();
        try {
            session.close();
        } catch (Exception e) {
        }
    }
}
