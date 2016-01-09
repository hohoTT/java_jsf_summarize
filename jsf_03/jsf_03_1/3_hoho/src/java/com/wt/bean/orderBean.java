package com.wt.bean;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.flow.FlowScoped;
import javax.inject.Named;

@ManagedBean
@Named
@FlowScoped("order")
public class orderBean implements Serializable{
    
    private String itemCount;
    private String address;
    private String itemName;
    
    public orderBean() {
    
    }

    public String getItemCount() {
        return itemCount;
    }

    public void setItemCount(String itemCount) {
        this.itemCount = itemCount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    
    public String getReturnValue(){
        return "/home";
    }
}
