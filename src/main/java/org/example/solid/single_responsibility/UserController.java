package org.example.solid.single_responsibility;

import java.io.IOException;

//Handles incoming JSON requests that work on User resource/entity
public class UserController {

    private final UserPersistenceService userPersistenceService = new UserPersistenceService();
    private final UserValidator validator = new UserValidator();
    private final UserJsonParse userJsonParse = new UserJsonParse();

    //Create a new user
    public String createUser(String userJson) throws IOException {

        final User user = userJsonParse.parse(userJson);

        final boolean isValid = validator.validateUser(user);

        if(!isValid) {
            return "ERROR";
        }

        userPersistenceService.saveUser(user);
        
        return "SUCCESS";
    } 


}