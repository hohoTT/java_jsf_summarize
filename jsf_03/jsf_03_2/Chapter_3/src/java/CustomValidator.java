
import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class CustomValidator implements Validator{

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        if(null!=value){
            if(value instanceof Date){
                Date expDate = (Date) value;
                Date curDate = new Date();
                if(curDate.compareTo(expDate)>=0){
                    FacesMessage message = new FacesMessage();
                    message.setSummary("不正确的到期时间");
                    message.setDetail("到期时间不能晚于当前时间");
                    message.setSeverity(FacesMessage.SEVERITY_ERROR);
                    throw new ValidatorException(message);
                }
            }
        }
    }
    
}
