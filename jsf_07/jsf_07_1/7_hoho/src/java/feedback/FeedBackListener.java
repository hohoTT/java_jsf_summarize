package feedback;

import java.util.Map;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;


public class FeedBackListener implements ActionListener{

    @Override
    public void processAction(ActionEvent event) throws AbortProcessingException {
        System.out.println("---------This is FeedBackListener-------");
        
        FacesContext context = FacesContext.getCurrentInstance();
        ExternalContext externalContext = context.getExternalContext();
        // 获得请求映射
        Map<String, Object> requestMap = externalContext.getRequestMap();
        requestMap.put("ConfirmMsg", "Feedback has been submitted");
                
    }   
}
