package com.yxm.entity;

public class ordertableEntity {
    public String orderID;
    public String orderUserName;
    public String orderGridName;
    public String ordergridImg;
    public String orderSumRMB;
    public String orderStat;
    public String orderTime;
    public String orderAddrs;

    public String getOrdergridImg() {
        return ordergridImg;
    }

    public void setOrdergridImg(String ordergridImg) {
        this.ordergridImg = ordergridImg;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getOrderUserName() {
        return orderUserName;
    }

    public void setOrderUserName(String orderUserName) {
        this.orderUserName = orderUserName;
    }

    public String getOrderGridName() {
        return orderGridName;
    }

    public void setOrderGridName(String orderGridName) {
        this.orderGridName = orderGridName;
    }

    public String getOrderSumRMB() {
        return orderSumRMB;
    }

    public void setOrderSumRMB(String orderSumRMB) {
        this.orderSumRMB = orderSumRMB;
    }

    public String getOrderStat() {
        return orderStat;
    }

    public void setOrderStat(String orderStat) {
        this.orderStat = orderStat;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderAddrs() {
        return orderAddrs;
    }

    public void setOrderAddrs(String orderAddrs) {
        this.orderAddrs = orderAddrs;
    }
}
