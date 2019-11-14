package cn.bdqn.erpsystem.pojo;

public class PurPerson {
    private Integer personid;

    private String personname;

    private String persontel;

    public Integer getPersonid() {
        return personid;
    }

    public void setPersonid(Integer personid) {
        this.personid = personid;
    }

    public String getPersonname() {
        return personname;
    }

    public void setPersonname(String personname) {
        this.personname = personname == null ? null : personname.trim();
    }

    public String getPersontel() {
        return persontel;
    }

    public void setPersontel(String persontel) {
        this.persontel = persontel == null ? null : persontel.trim();
    }
}