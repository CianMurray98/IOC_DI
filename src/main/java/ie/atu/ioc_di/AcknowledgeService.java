package ie.atu.ioc_di;

import lombok.Data;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

@Data
@Service
public class AcknowledgeService {
    public String ackMessage(UserDetails User){
        String message = "Thank you " + User.getName()  + " request recieved";
        return message;
    }
}
