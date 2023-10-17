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

    public String registerUser(String name, String email) {
        String message = emailService.sendEmail(email, "welcome\t" + name + "\t" + email);

        // Send confirmation email
        return emailService.sendEmail(email, "Registration Confirmation" + name + "!");
    }
}