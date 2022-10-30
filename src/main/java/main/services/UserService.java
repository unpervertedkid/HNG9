package main.services;

import main.models.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    /**
     * @return a User object with the following properties:
     * slackUsername: String
     * backEnd: boolean
     * age: integer
     * bio: String
     */
    public User getUser() {
        return new User("unpervedkid", true, 21, "I like to code in Java");
    }
}
