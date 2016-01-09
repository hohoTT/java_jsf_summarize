import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;


@FacesValidator(value = "fnv")
public class PhoneNumberValidator implements Validator{

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        String number = (String) value;
        if(!number.matches("1[0-9]{10}")){
            FacesMessage fm = new FacesMessage();
            fm.setSummary("number is not 11");
            fm.setDetail("number is not 11");
            fm.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(fm);
        }
    }
    
}
