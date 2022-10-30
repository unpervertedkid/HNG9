package main.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private String slackUsername;
    private boolean backEnd;
    private int age;
    private String bio;
}
