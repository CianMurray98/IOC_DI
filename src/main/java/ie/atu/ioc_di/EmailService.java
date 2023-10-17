package ie.atu.ioc_di;

import org.springframework.stereotype.Service;

@Service
public class EmailService {

    public void sendEmail(String to, String subject, String body) {
        // Implement email sending logic
        System.out.println("Sending email to: " + to + "\nSubject: " + subject + "\nBody: " + body);
    }
}