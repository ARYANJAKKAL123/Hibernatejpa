
package schoolmanagement;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Session session = new Configuration().configure().buildSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Student s = new Student();
        s.setId(1);
        s.setName("John");

        Teacher t = new Teacher();
        t.setId(101);
        t.setName("Mrs. Smith");

        Subject sub = new Subject();
        sub.setId(501);
        sub.setName("Mathematics");

        session.save(s);
        session.save(t);
        session.save(sub);

        tx.commit();
        session.close();
    }
}
