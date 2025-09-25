/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kido.arms.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.io.Serializable;

/**
 *
 * @author kttim
 */
@Entity
public class SupplyEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long supplyID; //id of the item, it doesnt represent the existence on warehouse
    private String supplyType;
    private String supplyBrand;
    private int supplyExistence; //existence in warerhouse
    private int supplyPresentation; //bottle, packge, etc

    public Long getSupplyID() {
        return supplyID;
    }

    public void setSupplyID(Long supplyID) {
        this.supplyID = supplyID;
    }

    public String getSupplyType() {
        return supplyType;
    }

    public void setSupplyType(String supplyType) {
        this.supplyType = supplyType;
    }

    public String getSupplyBrand() {
        return supplyBrand;
    }

    public void setSupplyBrand(String supplyBrand) {
        this.supplyBrand = supplyBrand;
    }

    public int getSupplyExistence() {
        return supplyExistence;
    }

    public void setSupplyExistence(int supplyExistence) {
        this.supplyExistence = supplyExistence;
    }

    public int getSupplyPresentation() {
        return supplyPresentation;
    }

    public void setSupplyPresentation(int supplyPresentation) {
        this.supplyPresentation = supplyPresentation;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (supplyID != null ? supplyID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the supplyID fields are not set
        if (!(object instanceof SupplyEntity)) {
            return false;
        }
        SupplyEntity other = (SupplyEntity) object;
        if ((this.supplyID == null && other.supplyID != null) || (this.supplyID != null && !this.supplyID.equals(other.supplyID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "kido.arms.entities.SupplyEntity[ supplyID=" + supplyID + " ]";
    }
    
}
