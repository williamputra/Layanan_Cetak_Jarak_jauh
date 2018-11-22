package Helper;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import pojos.DaftarRegistSignin;
import util.NewHibernateUtil;

public class UserHelper {

    public UserHelper() {
    }

    public List<DaftarRegistSignin> getAllDaftarRegistSignin() {
        List<DaftarRegistSignin> result = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        String query = "from DaftarRegistSignin d";
        Query q = session.createQuery(query);
        result = q.list();
        session.close();
        return result;
    }
}
