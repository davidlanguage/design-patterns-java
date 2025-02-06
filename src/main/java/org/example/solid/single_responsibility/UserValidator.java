package org.example.solid.single_responsibility;

public class UserValidator {

    public boolean validateUser(final User user){

        final User userSanitized = UserSanitizer.sanitizeName(user);

        return EmailSanitizer.checkEmail(userSanitized);
    }


}
