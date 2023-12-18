package com.hdu.my12306.domain;


import com.baomidou.mybatisplus.annotation.TableId;


public class User {
    @TableId
    private String uPhone;//手机号
    private String uPwd;//密码
    private String uName;//姓名
    private Integer uGender;//性别
    private String uIdcard;//身份证号

    public User() {
    }

    public User(String uPhone, String uPwd, String uName, Integer uGender, String uIdcard) {
        this.uPhone = uPhone;
        this.uPwd = uPwd;
        this.uName = uName;
        this.uGender = uGender;
        this.uIdcard = uIdcard;
    }

    /**
     * 获取
     * @return uPhone
     */
    public String getUPhone() {
        return uPhone;
    }

    /**
     * 设置
     * @param uPhone
     */
    public void setUPhone(String uPhone) {
        this.uPhone = uPhone;
    }

    /**
     * 获取
     * @return uPwd
     */
    public String getUPwd() {
        return uPwd;
    }

    /**
     * 设置
     * @param uPwd
     */
    public void setUPwd(String uPwd) {
        this.uPwd = uPwd;
    }

    /**
     * 获取
     * @return uName
     */
    public String getUName() {
        return uName;
    }

    /**
     * 设置
     * @param uName
     */
    public void setUName(String uName) {
        this.uName = uName;
    }

    /**
     * 获取
     * @return uGender
     */
    public Integer getUGender() {
        return uGender;
    }

    /**
     * 设置
     * @param uGender
     */
    public void setUGender(Integer uGender) {
        this.uGender = uGender;
    }

    /**
     * 获取
     * @return uIdcard
     */
    public String getUIdcard() {
        return uIdcard;
    }

    /**
     * 设置
     * @param uIdcard
     */
    public void setUIdcard(String uIdcard) {
        this.uIdcard = uIdcard;
    }

    public String toString() {
        return "User{uPhone = " + uPhone + ", uPwd = " + uPwd + ", uName = " + uName + ", uGender = " + uGender + ", uIdcard = " + uIdcard + "}";
    }
}
