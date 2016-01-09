
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

@FacesConverter(value="fnc")
public class PhoneNumberCovertor implements Converter{

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        value = value.trim();
        value = value.replace("-", "");
        if(!value.matches("[0-9]{11}")){
            FacesMessage fm = new FacesMessage();
            fm.setSummary("not 11 number Error");
            fm.setDetail("not 11 number Error");
            fm.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ConverterException(fm);
        }
        return value;
    }   

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return value.toString();
    }
}
