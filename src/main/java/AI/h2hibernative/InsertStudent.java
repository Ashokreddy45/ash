package AI.h2hibernative;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertStudent {

  public static void main(String[] args) {
  Student s = new Student();
  s.setId(1);
  s.setName("sai");
  s.setCgpa(10);
  
  SessionFactory factory = new Configuration().configure().buildSessionFactory();
  Session session = factory.openSession();
  Transaction tx = session.beginTransaction();
  
  session.save(s);
  
  tx.commit();
  
  
  }

}