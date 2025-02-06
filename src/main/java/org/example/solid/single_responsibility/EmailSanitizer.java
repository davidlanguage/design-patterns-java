package org.example.solid.single_responsibility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailSanitizer {

    private static final String EMAIL_REGEX =
            "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public static boolean checkEmail(final User user){

        if (user.getEmail() != null) {
            user.setEmail(user.getEmail().trim());
        }

        final String email = user.getEmail();



        return isValidEmail(email);

    }


    //check string for valid email address - this is not for prod.
    //Just for demo. This fails for lots of valid emails.
    private static boolean isValidEmail(final String value) {
        final Pattern pattern = Pattern.compile(EMAIL_REGEX);
        final Matcher matcher = pattern.matcher(value);
        return matcher.find();
    }
}
