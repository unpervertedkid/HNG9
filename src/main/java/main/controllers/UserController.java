package main.controllers;

import main.models.User;
import main.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    /**
     * @return a User object with the following properties:
     * slackUsername: String
     * backEnd: boolean
     * age: integer
     * bio: String
     */
    @GetMapping
    public User getUser() {
        return userService.getUser();
    }
}
