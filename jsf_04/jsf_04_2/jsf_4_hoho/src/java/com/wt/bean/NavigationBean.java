package com.wt.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class NavigationBean {
    
    private String value;
    private boolean flagA = false;
    private boolean flagB = false;
    private boolean flagC = false;
    
    public NavigationBean() {
    }

    public String getValue() {
        return value;
    }
    
    public void setValue(String value) {
        this.value = value;
        
        switch(this.value){
            case "A": flagA = true; break;
            case "B": flagB = true; break;
            case "C": flagC = true; break;
            default:break;
        }
        
    }
    
    public String selectItem(){
        return value;
    }

    public boolean isFlagA() {
        return flagA;
    }

    
    public void setFlagA(boolean flagA) {
        this.flagA = flagA;
    }

    public boolean isFlagB() {
        return flagB;
    }

    public void setFlagB(boolean flagB) {
        this.flagB = flagB;
    }

    public boolean isFlagC() {
        return flagC;
    }

    public void setFlagC(boolean flagC) {
        this.flagC = flagC;
    }
    
}
