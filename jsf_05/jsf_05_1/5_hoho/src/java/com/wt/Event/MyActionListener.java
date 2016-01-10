package com.wt.Event;

import javax.faces.component.UIComponent;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

public class MyActionListener implements ActionListener{

    @Override
    public void processAction(ActionEvent event) throws AbortProcessingException {
        UIComponent component = event.getComponent();
        System.out.println("ActionEvent occurred. Component is " + component + 
                ", id = " + component.getClientId());
    }
    
}
