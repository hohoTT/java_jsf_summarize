package com.wt.bean;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;

@ManagedBean
@Named("payment")
@RequestScoped
public class Payment {

    private String movileNo;
    private double amount;
    private String ccNo;
    private Date expDate = new Date();
    
    public Payment() {
    
    }

    public String getMovileNo() {
        return movileNo;
    }

    public void setMovileNo(String movileNo) {
        this.movileNo = movileNo;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCcNo() {
        return ccNo;
    }

    public void setCcNo(String ccNo) {
        this.ccNo = ccNo;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }
}
