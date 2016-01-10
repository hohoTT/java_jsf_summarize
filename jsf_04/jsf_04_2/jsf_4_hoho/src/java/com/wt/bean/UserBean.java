package com.wt.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class UserBean {
    
    private String info;
    
    public UserBean() {
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    
    public String checkInfo(){
        if("info".equalsIgnoreCase(info)){
            return "success";
        }
        else{
            return "error";
        }
    }
    
    public String failedAction(){
        if(this.info.trim().matches("[0-9]+")){
            return "failednum";
        }
        if(this.info.trim().matches("[a-zA-Z]+")){
            return "failedstr";
        }
        else{
            return "error";
        }
    }
    
}
