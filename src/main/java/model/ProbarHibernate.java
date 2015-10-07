
package model;

import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 * @author JovannyCk
 */
public class ProbarHibernate {
    
    public static void main(String[] args)throws Exception{
        System.out.println("Bienvenido a Hibernate!!");
        
        SessionFactory fuck= HibernateUtilidades.getSessionFactory();
                  Session sesion=   fuck.openSession();
                  Transaction tranza=      sesion.beginTransaction();
                  //Usuario u=new Usuario("ghosbyte", "hack");
                  //a guardar
                 // sesion.save(u);
                  //Vamo hacer una busqueda en nuestros usuarios
                  //Criteria cricri=sesion.createCriteria(Usuario.class);
                  //ArrayList<Usuario> usuarios=(ArrayList<Usuario>) cricri.list();
                  //for(Usuario u:usuarios){
                  //System.out.println(u);
                  //}
                 // Criteria cricri=sesion.createCriteria(Usuario.class);
                   // Usuario u= (Usuario)cricri.add(Restrictions.idEq(1)).uniqueResult();
                    //System.out.println(u);
                  //Vamos a probar update
                 // Usuario u=new Usuario(1);
                   //       u.setLogin("cesar");
                     //     u.setPassword("ck");
                       //   sesion.update(u);
                  //Vamos a borrar por id
                  
                  Usuario u=new Usuario(1);
                  sesion.delete(u);
                  
                  
                  tranza.commit();
                  sesion.close();
                  System.out.println();
    }
    
}
