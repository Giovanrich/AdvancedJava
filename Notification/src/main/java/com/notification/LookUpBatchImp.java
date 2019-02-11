package com.notification;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * @Created on Feb 7, 2019
 * @author chiraran (Giovanrich/JWizard)
 */
public class LookUpBatchImp implements LookUpBatchDAO {

    @Override
    public List<LookUpBatch> getBatches() {
        List<LookUpBatch> batches = new ArrayList<>();
        try {

            Configuration con = new Configuration().configure().addAnnotatedClass(LookUpBatch.class);
            SessionFactory sf = con.buildSessionFactory();
            Session session = sf.openSession();
            Transaction trans = session.beginTransaction();
            Query query = session.createQuery("FROM LookUpBatch");
            batches=query.list();        
            session.close();
            sf.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
        return batches;
    }

    @Override
    public void delete(String qcNumber) {
          try {

            Configuration con = new Configuration().configure().addAnnotatedClass(LookUpBatch.class);
            SessionFactory sf = con.buildSessionFactory();
            Session session = sf.openSession();
            Transaction trans = session.beginTransaction();
            Query query = session.createQuery("DELETE FROM LookUpBatch WHERE qcNumber=:q");
            query.setParameter("q",qcNumber );
            query.executeUpdate();                    
            session.close();
            sf.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
    
       

}
