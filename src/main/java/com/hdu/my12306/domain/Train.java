package com.hdu.my12306.domain;
import java.time.LocalDate;
import java.util.Date;


public class Train {
    private String sSName;
    private String eSName;
    private LocalDate startTime;
    private LocalDate endTime;


    public Train() {
    }

    public Train(String sSName, String eSName, LocalDate startTime, LocalDate endTime) {
        this.sSName = sSName;
        this.eSName = eSName;
        this.startTime = startTime;
        this.endTime = endTime;
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

    public String toString() {
        return "Train{sSName = " + sSName + ", eSName = " + eSName + ", startTime = " + startTime + ", endTime = " + endTime + "}";
    }
}
