package cn.bdqn.erpsystem.pojo;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.CancellationException;

public class ErpUser {
    private Integer uId;//编号

    private String uName;//姓名

    private String uPassword;//密码

    private String uType;//类型

    private Date uCreatedate;//创建时间

    private Date uBirthday;//生日

    private String uEmail;//邮箱

    private String uPhone;//联系方式

    private String uRemarks;//备注

    private Integer uAge;//年龄

    public Integer getuAge() {
        Calendar instance = Calendar.getInstance();
        int yearNow=instance.get(Calendar.YEAR);
        instance.setTime(uBirthday);
        Integer yearBirthday=instance.get(Calendar.YEAR);
        return yearNow-yearBirthday;
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

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail == null ? null : uEmail.trim();
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone == null ? null : uPhone.trim();
    }

    public String getuRemarks() {
        return uRemarks;
    }

    public void setuRemarks(String uRemarks) {
        this.uRemarks = uRemarks == null ? null : uRemarks.trim();
    }
}