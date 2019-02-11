package com.notification;

import java.util.List;

/**
 * @Created on Feb 7, 2019
 * @author chiraran (Giovanrich/JWizard)
 */
public interface LookUpBatchDAO {

    public List<LookUpBatch> getBatches();

    public void delete(String qcNUmber);
}
