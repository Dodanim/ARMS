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
public class GuestEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long guestId;
    private String guestName;
    private int guestAge; //it could be use it to evaluate whether a parent have an under 5 child
    private int guestHostingZone; // 1-arena 2-Woods
    private int roomNumber; //between 1 and 4000
    private int guestQuantity; //how many people living their room
    private LocalDateTime guestArrivedDate;
    private String guestDetails; //important information about them, allergies, illness, relate with the use of some brand or products etc

    public Long getGuestId() {
        return guestId;
    }

    public void setGuestId(Long guestId) {
        this.guestId = guestId;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public int getGuestAge() {
        return guestAge;
    }

    public void setGuestAge(int guestAge) {
        this.guestAge = guestAge;
    }

    public int getGuestHostingZone() {
        return guestHostingZone;
    }

    public void setGuestHostingZone(int guestHostingZone) {
        this.guestHostingZone = guestHostingZone;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getGuestQuantity() {
        return guestQuantity;
    }

    public void setGuestQuantity(int guestQuantity) {
        this.guestQuantity = guestQuantity;
    }

    public LocalDateTime getGuestArrivedDate() {
        return guestArrivedDate;
    }

    public void setGuestArrivedDate(LocalDateTime guestArrivedDate) {
        this.guestArrivedDate = guestArrivedDate;
    }

    public String getGuestDetails() {
        return guestDetails;
    }

    public void setGuestDetails(String guestDetails) {
        this.guestDetails = guestDetails;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (guestId != null ? guestId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GuestEntity)) {
            return false;
        }
        GuestEntity other = (GuestEntity) object;
        if ((this.guestId == null && other.guestId != null) || (this.guestId != null && !this.guestId.equals(other.guestId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "kguestIdo.arms.entities.GuestEntity[ guestId=" + guestId + " ]";
    }

}
