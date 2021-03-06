//package com.cognizant.cde.tjfems.model;
//
//import java.io.Serializable;
//import java.util.Objects;
//
//public class Equipment implements Serializable {
//    private Long equipmentId;
//
//    private String equipmentType;
//
//    private Long officeId;
//
//    private boolean assigned;
//
//    private Long userId;
//
//    private String comments;
//
//    public Equipment() {};
//
//    public Equipment(Long equipmentId, String equipmentType, Long officeId, boolean assigned, Long userId, String comments) {
//        this.equipmentId = equipmentId;
//        this.equipmentType = equipmentType;
//        this.officeId = officeId;
//        this.assigned = assigned;
//        this.userId = userId;
//        this.comments = comments;
//    }
//
//    public Long getEquipmentId() {
//        return equipmentId;
//    }
//
//    public void setEquipmentId(Long equipmentId) {
//        this.equipmentId = equipmentId;
//    }
//
//    public String getEquipmentType() {
//        return equipmentType;
//    }
//
//    public void setEquipmentType(String equipmentType) {
//        this.equipmentType = equipmentType;
//    }
//
//    public Long getOfficeId() {
//        return officeId;
//    }
//
//    public void setOfficeId(Long officeId) {
//        this.officeId = officeId;
//    }
//
//    public boolean isAssigned() {
//        return assigned;
//    }
//
//    public void setAssigned(boolean assigned) {
//        this.assigned = assigned;
//    }
//
//    public Long getUserId() {
//        return userId;
//    }
//
//    public void setUserId(Long userId) {
//        this.userId = userId;
//    }
//
//    public String getComments() {
//        return comments;
//    }
//
//    public void setComments(String comments) {
//        this.comments = comments;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Equipment)) return false;
//        Equipment equipment = (Equipment) o;
//        return isAssigned() == equipment.isAssigned() &&
//                Objects.equals(getEquipmentId(), equipment.getEquipmentId()) &&
//                Objects.equals(getEquipmentType(), equipment.getEquipmentType()) &&
//                Objects.equals(getOfficeId(), equipment.getOfficeId()) &&
//                Objects.equals(getUserId(), equipment.getUserId()) &&
//                Objects.equals(getComments(), equipment.getComments());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getEquipmentId(), getEquipmentType(), getOfficeId(), isAssigned(), getUserId(), getComments());
//    }
//}

package com.cognizant.cde.tjfems.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Equipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long equipmentId;
    @Column(nullable = false)
    private String equipmentType;
    @Column(nullable = false)
    private Long officeId;
    @Column(nullable = false)
    private boolean assigned;
    @Column
    private Long userId;
    @Column
    private String comments;

    public Long getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Long equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }

    public Long getOfficeId() {
        return officeId;
    }

    public void setOfficeId(Long officeId) {
        this.officeId = officeId;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getComment() {
        return comments;
    }

    public void setComment(String comments) {
        this.comments = comments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipment equipment = (Equipment) o;
        return assigned == equipment.assigned &&
                Objects.equals(equipmentId, equipment.equipmentId) &&
                Objects.equals(equipmentType, equipment.equipmentType) &&
                Objects.equals(officeId, equipment.officeId) &&
                Objects.equals(userId, equipment.userId) &&
                Objects.equals(comments, equipment.comments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(equipmentId, equipmentType, officeId, assigned, userId, comments);
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "equipmentId=" + equipmentId +
                ", equipmentType='" + equipmentType + '\'' +
                ", officeId=" + officeId +
                ", assigned=" + assigned +
                ", userId=" + userId +
                ", comment='" + comments + '\'' +
                '}';
    }
}
