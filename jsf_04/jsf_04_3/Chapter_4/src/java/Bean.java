/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author student
 */
@ManagedBean
@RequestScoped
public class Bean {

    private String value;
    
    /**
     * Creates a new instance of Bean
     */
    public Bean() {
    }
    
    // ALT + Insert

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
        switch(this.value){
            case "a":
                flagA = true;
                flagB = false;
                flagC = false;
                break;
            case "b":
                flagA = false;
                flagB = true;
                flagC = false;
                break;
            case "c":
                flagA = false;
                flagB = false;
                flagC = true;
                break;
            default:
                flagA = false;
                flagB = false;
                flagC = false;
                break;
        }
    }
    
    public String selectItem(){
        return value;
    }
    
    private boolean flagA;
    private boolean flagB;
    private boolean flagC;

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
