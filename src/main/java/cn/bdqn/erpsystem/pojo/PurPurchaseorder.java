package cn.bdqn.erpsystem.pojo;

import java.util.Date;

public class PurPurchaseorder {
    private Integer pId;

    private String pOrder;

    private String pName;

    private Integer pNumber;

    private Double pMoney;

    private String pDate;

    private String pPerson;

    private String pProviderid;

    private Integer pProductionid;

    private Integer pWarehouseid;

    private String pRemarks;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpOrder() {
        return pOrder;
    }

    public void setpOrder(String pOrder) {
        this.pOrder = pOrder == null ? null : pOrder.trim();
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public Integer getpNumber() {
        return pNumber;
    }

    public void setpNumber(Integer pNumber) {
        this.pNumber = pNumber;
    }

    public Double getpMoney() {
        return pMoney;
    }

    public void setpMoney(Double pMoney) {
        this.pMoney = pMoney;
    }

    public String getpDate() {
        return pDate;
    }

    public void setpDate(String pDate) {
        this.pDate = pDate;
    }

    public String getpPerson() {
        return pPerson;
    }

    public void setpPerson(String pPerson) {
        this.pPerson = pPerson == null ? null : pPerson.trim();
    }

    public String getpProviderid() {
        return pProviderid;
    }

    public void setpProviderid(String pProviderid) {
        this.pProviderid = pProviderid == null ? null : pProviderid.trim();
    }

    public Integer getpProductionid() {
        return pProductionid;
    }

    public void setpProductionid(Integer pProductionid) {
        this.pProductionid = pProductionid;
    }

    public Integer getpWarehouseid() {
        return pWarehouseid;
    }

    public void setpWarehouseid(Integer pWarehouseid) {
        this.pWarehouseid = pWarehouseid;
    }

    public String getpRemarks() {
        return pRemarks;
    }

    public void setpRemarks(String pRemarks) {
        this.pRemarks = pRemarks == null ? null : pRemarks.trim();
    }
}