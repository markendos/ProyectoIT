package modelo.DAO;

import java.io.Serializable;
import modelo.Valoraciones;
import modelo.ValoracionesId;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author marwi
 */
public class ValoracionDAO {

    public static Serializable insertarValoracion(Valoraciones v) {
        Session sesion = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = null;
        Serializable s = null;

        tx = sesion.beginTransaction();
        s = sesion.save(v);
        tx.commit();

        return s;
    }

    public static void eliminarValoracion(ValoracionesId vid) {
        Session sesion = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = null;

        try {
            tx = sesion.beginTransaction();
            Valoraciones v = (Valoraciones) sesion.load(Valoraciones.class, vid);
            sesion.delete(v);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
        }
    }

}
