/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author lenovo
 */
@ManagedBean
@Named("payment")
@RequestScoped
public class Payment {

    private String mobileNo;
    private double amount;
    private String cCnNumber;
    private Date expDate = new Date();

    /**
     * Creates a new instance of Payment
     */
    public Payment() {
    }

    public String getCnNumber() {
        return cCnNumber;
    }

    public void setCnNumber(String cCnNumber) {
        this.cCnNumber = cCnNumber;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
