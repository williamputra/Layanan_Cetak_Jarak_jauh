/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import pojos.FileData;
import util.NewHibernateUtil;

/**
 *
 * @author admin
 */
public class PemilikHelper {
  public PemilikHelper() {
    }

    public List<FileData> getAllFileData() {
        List<FileData> result = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        String query = "from FileData f";
        Query q = session.createQuery(query);
        result = q.list();
        session.close();
        return result;
    }
}  

