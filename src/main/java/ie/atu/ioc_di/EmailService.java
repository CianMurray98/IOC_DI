package ie.atu.ioc_di;

import org.springframework.stereotype.Service;

@Service
public class EmailService {

    public String sendEmail(String to, String message) {
        // Implement email sending logic
        //System.out.println("Sending email to: " + to + "\nSubject: " + subject + "\nBody: " + body);
        return message;
    }
}