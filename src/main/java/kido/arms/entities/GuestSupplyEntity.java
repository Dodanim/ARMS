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
import java.time.LocalDateTime;

/**
 *
 * @author kttim
 */
@Entity
public class GuestSupplyEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long guestId;
    private int supplyId;
    private LocalDateTime guestSupplyDate; //when they request the item
    private int userIdProvider; //which manager attend the request

    public Long getGuestId() {
        return guestId;
    }

    public void setGuestId(Long guestId) {
        this.guestId = guestId;
    }

    public int getSupplyId() {
        return supplyId;
    }

    public void setSupplyId(int supplyId) {
        this.supplyId = supplyId;
    }

    public LocalDateTime getGuestSupplyDate() {
        return guestSupplyDate;
    }

    public void setGuestSupplyDate(LocalDateTime guestSupplyDate) {
        this.guestSupplyDate = guestSupplyDate;
    }

    public int getUserIdProvider() {
        return userIdProvider;
    }

    public void setUserIdProvider(int userIdProvider) {
        this.userIdProvider = userIdProvider;
    }

   
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (guestId != null ? guestId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the guestId fields are not set
        if (!(object instanceof GuestSupplyEntity)) {
            return false;
        }
        GuestSupplyEntity other = (GuestSupplyEntity) object;
        if ((this.guestId == null && other.guestId != null) || (this.guestId != null && !this.guestId.equals(other.guestId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "kido.arms.entities.GuestSupplyEntity[ guestId=" + guestId + " ]";
    }

}
