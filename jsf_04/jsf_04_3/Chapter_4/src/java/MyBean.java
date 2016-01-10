/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author lenovo
 */
@ManagedBean
@RequestScoped
public class MyBean {

    private String username;
    private String password;

    /**
     * Creates a new instance of MyBean
     */
    public MyBean() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
        System.out.println("setUsername. this.username = " + this.username);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        System.out.println("setUsername. this.password = " + this.password);
    }

    public String checkName() {
        System.out.println("checkName. username = " + username + ", password = " + password);
        if ("username".equals(this.username) && "password".equals(this.password)) {
            return ""; // 测试发现，这里输出null或者""都是一样的。都表示不进行做任何跳转。但是不能是多个空格类字符的字符串。
        } else {
            return "error";
        }
    }

}
