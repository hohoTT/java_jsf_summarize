package com.wt.Event;

import javax.faces.component.UIComponent;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;

public class MyValueChangeListener implements ValueChangeListener{

    @Override
    public void processValueChange(ValueChangeEvent event) throws AbortProcessingException {
        
        UIComponent component = event.getComponent();
        Object oldValue = event.getOldValue();
        Object newValue = event.getNewValue();
        System.out.println("ValueChangeEvent occured, component is " + component +
                ", id = " + component.getClientId() + 
                ", oldValue = " + oldValue +
                ", newValue = " + newValue);
        
    }
}
