package com.springbootplus.springboot.entity;

public class StudentInfo {

    public String username;
    public String sex;
    public String myself;
    public String password;
    public String QQ;
    public String birthday;

    public StudentInfo() {
    }

    public StudentInfo(String username, String sex, String myself, String password, String QQ, String birthday) {
        this.username = username;
        this.sex = sex;
        this.myself = myself;
        this.password = password;
        this.QQ = QQ;
        this.birthday = birthday;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMyself() {
        return myself;
    }

    public void setMyself(String myself) {
        this.myself = myself;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getQQ() {
        return QQ;
    }

    public void setQQ(String QQ) {
        this.QQ = QQ;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
