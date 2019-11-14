package cn.bdqn.erpsystem.pojo;

import java.util.Date;

public class PurApply {
    private Integer aId;

    private String aOrder;

    private Integer aSection;

    private Integer aPerson;

    private String aName;

    private Integer aCount;

    private Double aMoney;

    private Date aDate;

    private String aRemarks;

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getaOrder() {
        return aOrder;
    }

    public void setaOrder(String aOrder) {
        this.aOrder = aOrder == null ? null : aOrder.trim();
    }

    public Integer getaSection() {
        return aSection;
    }

    public void setaSection(Integer aSection) {
        this.aSection = aSection;
    }

    public Integer getaPerson() {
        return aPerson;
    }

    public void setaPerson(Integer aPerson) {
        this.aPerson = aPerson;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName == null ? null : aName.trim();
    }

    public Integer getaCount() {
        return aCount;
    }

    public void setaCount(Integer aCount) {
        this.aCount = aCount;
    }

    public Double getaMoney() {
        return aMoney;
    }

    public void setaMoney(Double aMoney) {
        this.aMoney = aMoney;
    }

    public Date getaDate() {
        return aDate;
    }

    public void setaDate(Date aDate) {
        this.aDate = aDate;
    }

    public String getaRemarks() {
        return aRemarks;
    }

    public void setaRemarks(String aRemarks) {
        this.aRemarks = aRemarks == null ? null : aRemarks.trim();
    }
}