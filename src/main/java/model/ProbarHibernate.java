
package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * @author JovannyCk
 */
public class ProbarHibernate {
    
    public static void main(String[] args)throws Exception{
        System.out.println("Bienvenido a Hibernate!!");
        
        SessionFactory fuck= HibernateUtilidades.getSessionFactory();
                  Session sesion=   fuck.openSession();
                  Transaction tranza=      sesion.beginTransaction();
                  Usuario u=new Usuario("cesar", "vergas");
                  //a guardar
                  sesion.save(u);
                  tranza.commit();
                  sesion.close();
                  System.out.println("Ya chingaste !!");
    }
    
}
