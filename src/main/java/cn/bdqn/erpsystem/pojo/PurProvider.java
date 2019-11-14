package cn.bdqn.erpsystem.pojo;

public class PurProvider {
    private Integer proId;

    private String proCode;

    private String proName;

    private String proAddress;

    private String proPerson;

    private String proTel;

    private String proRemarks;

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getProCode() {
        return proCode;
    }

    public void setProCode(String proCode) {
        this.proCode = proCode == null ? null : proCode.trim();
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName == null ? null : proName.trim();
    }

    public String getProAddress() {
        return proAddress;
    }

    public void setProAddress(String proAddress) {
        this.proAddress = proAddress == null ? null : proAddress.trim();
    }

    public String getProPerson() {
        return proPerson;
    }

    public void setProPerson(String proPerson) {
        this.proPerson = proPerson == null ? null : proPerson.trim();
    }

    public String getProTel() {
        return proTel;
    }

    public void setProTel(String proTel) {
        this.proTel = proTel == null ? null : proTel.trim();
    }

    public String getProRemarks() {
        return proRemarks;
    }

    public void setProRemarks(String proRemarks) {
        this.proRemarks = proRemarks == null ? null : proRemarks.trim();
    }
}