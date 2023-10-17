package ie.atu.ioc_di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final EmailService emailService;

    @Autowired
    public UserService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void registerUser(String name, String email) {
        // Perform user registration logic

        // Send confirmation email
        emailService.sendEmail(email, "Registration Confirmation", "Welcome, " + name + "!");
    }
}