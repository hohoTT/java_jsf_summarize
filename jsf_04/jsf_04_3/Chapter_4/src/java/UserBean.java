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
public class UserBean {
    private String info;
    /**
     * Creates a new instance of UserBean
     */
    public UserBean() {
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    
    // 主要是用来提供验证结果：success、error、
    public String checkInfo(){
        if("info".equalsIgnoreCase(info)){
            return "success";
        } else {
            return "error";
        }
    }
    
    
}
