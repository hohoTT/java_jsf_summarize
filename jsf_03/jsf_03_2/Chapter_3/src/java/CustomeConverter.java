
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lenovo
 */
public class CustomeConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        String number = value.trim();
        int len = number.length();
        if (len != 16) {
            FacesMessage message = new FacesMessage();
            message.setSummary("Invalid Card Number");
            message.setDetail("The string must has 16 characters.");
            throw new ConverterException(message);
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 4; i++) {
                if (i != 0) {
                    sb.append("-");
                }
                sb.append(number.substring(4 * i, 4 * (i + 1)));
            }
            value = sb.toString();
        }
        return value;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return value.toString();
    }

}
