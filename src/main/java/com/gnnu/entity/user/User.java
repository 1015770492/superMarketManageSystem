package com.gnnu.entity.user;

public class User {

    private Integer uid;
    private String uname;
    private String upassword;
    private String uwork;

    public User() {   }

    public User(String uname, String upassword, String uwork) {
        this.uname = uname;
        this.upassword = upassword;
        this.uwork = uwork;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    public String getUwork() {
        return uwork;
    }

    public void setUwork(String uwork) {
        this.uwork = uwork;
    }
}
