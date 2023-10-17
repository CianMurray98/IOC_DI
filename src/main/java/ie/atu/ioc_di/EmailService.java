package ie.atu.ioc_di;

import org.springframework.stereotype.Service;

@Service
public class EmailService {

    public String sendEmail(String to, String message) {
        return message;
    }
}