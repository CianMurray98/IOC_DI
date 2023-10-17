package ie.atu.ioc_di;

import ie.atu.ioc_di.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
        public class UserController {
            private final UserService userService;

            @Autowired
            public UserController(UserService userService) {
                this.userService = userService;
            }

            @GetMapping("/registerUser/{name}/{email}")
            public String registerUser(@PathVariable String name, @PathVariable String email) {
                return userService.registerUser(name, email);
        }
    }