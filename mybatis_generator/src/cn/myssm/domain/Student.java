package cn.myssm.domain;

import java.util.Date;

public class Student {
    private Long sid;

    private String sname;

    private Long snumber;

    private Integer sage;

    private Date sbirthdate;

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public Long getSnumber() {
        return snumber;
    }

    public void setSnumber(Long snumber) {
        this.snumber = snumber;
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }

    public Date getSbirthdate() {
        return sbirthdate;
    }

    public void setSbirthdate(Date sbirthdate) {
        this.sbirthdate = sbirthdate;
    }
}