package com.wt.bean;

import java.util.HashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.html.HtmlInputText;
import javax.faces.event.ValueChangeEvent;

@ManagedBean
@RequestScoped
public class PersonUIBean {
    
    private HtmlInputText idText;
    private HtmlInputText nameText;
    private HtmlInputText ageText;
    
    public PersonUIBean() {
        
    }

    public HtmlInputText getIdText() {
        return idText;
    }

    public void setIdText(HtmlInputText idText) {
        this.idText = idText;
    }

    public HtmlInputText getNameText() {
        return nameText;
    }

    public void setNameText(HtmlInputText nameText) {
        this.nameText = nameText;
    }

    public HtmlInputText getAgeText() {
        return ageText;
    }

    public void setAgeText(HtmlInputText ageText) {
        this.ageText = ageText;
    }
    
    public void autoFill(ValueChangeEvent vce){
        String id = vce.getNewValue().toString();
        String name = names.get(id);
        int age = ages.get(id);
        
        nameText.setValue(name);
        ageText.setValue(age);
    }
    
    // 使用Map模拟数据库
    private static final Map<String, String> names;
    private static final Map<String, Integer> ages;
    
    static {
        names = new HashMap<String, String>();
        ages = new HashMap<String, Integer>();
        
        for (int i = 0; i < 100; i++) {
            names.put(String.valueOf(i), "name " + i);
            ages.put(String.valueOf(i), 10 + (int)(Math.random() * 50));
        }
        
    }
    
}
