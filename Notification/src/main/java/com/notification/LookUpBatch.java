
package com.notification;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *@Created on Feb 7, 2019
 *@author chiraran (Giovanrich/JWizard)
 */
@Entity
@Table(name="lookup_batches")
public class LookUpBatch {
    
    @Id
    @GeneratedValue
    private int id;
    private String qcNUmber;
    private String productType;
    private String color;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    

    public String getQcNUmber() {
        return qcNUmber;
    }

    public void setQcNUmber(String qcNUmber) {
        this.qcNUmber = qcNUmber;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "LookUpBatch{" + "id=" + id + ", qcNUmber=" + qcNUmber + ", productType=" + productType + ", color=" + color + ", status=" + status + '}';
    }

  

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LookUpBatch other = (LookUpBatch) obj;
        if (!Objects.equals(this.qcNUmber, other.qcNUmber)) {
            return false;
        }
        return true;
    }
    
    

}
