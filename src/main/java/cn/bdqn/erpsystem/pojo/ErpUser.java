package cn.bdqn.erpsystem.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class ErpUser {
    private Integer uId;

    private String uName;

    private String uPassword;

    private String uType;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date uCreatedate;

    private Date uBirthday;

    private Integer uAge;

    public Integer getuAge() {
        Date date=new Date();
        Integer uAge=date.getYear()-uBirthday.getYear();
        return uAge;
    }


    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }

    public String getuType() {

        return uType;
    }

    public void setuType(String uType) {
        this.uType = uType == null ? null : uType.trim();
    }

    public Date getuCreatedate() {
        return uCreatedate;
    }

    public void setuCreatedate(Date uCreatedate) {
        this.uCreatedate = uCreatedate;
    }

    public Date getuBirthday() {
        return uBirthday;
    }

    public void setuBirthday(Date uBirthday) {
        this.uBirthday = uBirthday;
    }
}