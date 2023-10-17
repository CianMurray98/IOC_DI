package ie.atu.ioc_di;

import ie.atu.ioc_di.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
//      @RequestMapping("/api")
        public class UserController {
    /*
            private final UserService userService;

            @Autowired
            public UserController(UserService userService) {
                this.userService = userService;
            }

            @GetMapping("/registerUser/{name}/{email}")
            public String registerUser(@PathVariable String name, @PathVariable String email) {
                return userService.registerUser(name, email);
        }
        @PostMapping("/registerUserBody")
        public String registerUserFromBody(@RequestBody UserDetails userDetails) {
            return userService.registerUser(userDetails.getName(), userDetails.getPassword());
        }*/
        private final AcknowledgeService acknowledgeService;

        @Autowired
    public UserController(AcknowledgeService acknowledgeService){
            this.acknowledgeService = acknowledgeService;
        }

        @PostMapping("confirm-and-register")
    public String confirmAndRegister(@RequestBody UserDetails userdetails){
            return acknowledgeService.ackMessage(userdetails);
        }
    }