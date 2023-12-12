package com.hdu.my12306.domain;

import java.time.LocalDate;

public class TrainAll {
    private String sSName;
    private String eSName;
    private LocalDate startTime;
    private LocalDate endTime;
    private String tNo;
    private Integer tType;
    private Integer num;
    private String money;

    public TrainAll() {
    }

    public TrainAll(String sSName, String eSName, LocalDate startTime, LocalDate endTime, String tNo, Integer tType, Integer num, String money) {
        this.sSName = sSName;
        this.eSName = eSName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.tNo = tNo;
        this.tType = tType;
        this.num = num;
        this.money = money;
    }

    /**
     * 获取
     * @return sSName
     */
    public String getSSName() {
        return sSName;
    }

    /**
     * 设置
     * @param sSName
     */
    public void setSSName(String sSName) {
        this.sSName = sSName;
    }

    /**
     * 获取
     * @return eSName
     */
    public String getESName() {
        return eSName;
    }

    /**
     * 设置
     * @param eSName
     */
    public void setESName(String eSName) {
        this.eSName = eSName;
    }

    /**
     * 获取
     * @return startTime
     */
    public LocalDate getStartTime() {
        return startTime;
    }

    /**
     * 设置
     * @param startTime
     */
    public void setStartTime(LocalDate startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取
     * @return endTime
     */
    public LocalDate getEndTime() {
        return endTime;
    }

    /**
     * 设置
     * @param endTime
     */
    public void setEndTime(LocalDate endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取
     * @return tNo
     */
    public String getTNo() {
        return tNo;
    }

    /**
     * 设置
     * @param tNo
     */
    public void setTNo(String tNo) {
        this.tNo = tNo;
    }

    /**
     * 获取
     * @return tType
     */
    public Integer getTType() {
        return tType;
    }

    /**
     * 设置
     * @param tType
     */
    public void setTType(Integer tType) {
        this.tType = tType;
    }

    /**
     * 获取
     * @return num
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 设置
     * @param num
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * 获取
     * @return money
     */
    public String getMoney() {
        return money;
    }

    /**
     * 设置
     * @param money
     */
    public void setMoney(String money) {
        this.money = money;
    }

    public String toString() {
        return "TrainAll{sSName = " + sSName + ", eSName = " + eSName + ", startTime = " + startTime + ", endTime = " + endTime + ", tNo = " + tNo + ", tType = " + tType + ", num = " + num + ", money = " + money + "}";
    }
}
