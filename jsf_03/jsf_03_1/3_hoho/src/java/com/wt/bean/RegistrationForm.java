package com.wt.bean;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.flow.FlowScoped;
import javax.inject.Scope;

@ManagedBean
@SessionScoped
public class RegistrationForm {

    private String name;
    private String address;
    private String password;
    
    public RegistrationForm() {
    
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String ShowMe(){
        return "name : " + name + "<br/>" +
               "address : " + address + "<br/>" +
                "password : " + password + "<br/>";
    }
    
}
