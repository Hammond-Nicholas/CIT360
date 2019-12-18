/*
 * Project Name: NixServlet
 * Package Name: 
 * Class Name: HibernateUtil
 * 
 * Created on Dec 11, 2019, 11:44:26 PM
 * Created by Nick Hammond
 *
 * Purpose: <What is the purpose of the file?>
 */
import org.hibernate.HibernateException;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * sandboxed from https://www.tutorialspoint.com/hibernate/hibernate_quick_guide.htm
 */
public class HibernateUtil {
    private static final SessionFactory sessionFactory;
    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (HibernateException ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}