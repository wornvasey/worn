package com.springbootplus.springboot.entity;

import java.util.HashMap;
import java.util.Map;


public class RegisterInfoYanZheng {

        public String username;
        public String password;
        public String password1;
        public String QQ;
        HashMap<String,String>errors = new HashMap<String,String>();

    public RegisterInfoYanZheng(String username, String password, String password1, String QQ, HashMap<String, String> errors) {
        this.username = username;
        this.password = password;
        this.password1 = password1;
        this.QQ = QQ;
        this.errors = errors;
    }

    public RegisterInfoYanZheng() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public String getQQ() {
        return QQ;
    }

    public void setQQ(String QQ) {
        this.QQ = QQ;
    }

    public boolean puanduan() {
        boolean flag = true;
        if (username == null || username.trim().equals("")) {
            errors.put("username", "请输入用户名");
            flag = false;
        }
        if (password == null || password.trim().equals("")) {

            errors.put("password", "请输入密码");
            flag = false;
        } else if (password.length() > 12 || password.length() < 6) {
            errors.put("password", "请输入6-12位数字");
            flag = false;
        }
        if (!password.equals(password1) && password != null) {
            errors.put("password1", "两次密码不一致");
            flag = false;
        }
        if (QQ.length() > 13 || QQ.length() < 5) {
            errors.put("QQ", "请输入正确的qq号码");
            flag = false;
        }

        return flag;
    }

    public Map<String,String> getErrors(){

        return  errors;
    }


}
