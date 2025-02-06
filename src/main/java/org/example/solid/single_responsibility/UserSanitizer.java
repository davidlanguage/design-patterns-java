package org.example.solid.single_responsibility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserSanitizer {


    private static final String ALPHANUMERIC_REGEX =
            "[^A-Za-z0-9]";


    public static User sanitizeName(final User user) {

        final String userName = user.getName();

        if (userName != null && isValidAlphaNumeric(userName)) {
            user.setName(user.getName().trim());
        }
        return user;
    }

    private static boolean isValidAlphaNumeric(final String value) {
        final Pattern pattern = Pattern.compile(ALPHANUMERIC_REGEX);
        final Matcher matcher = pattern.matcher(value);
        return !matcher.find();
    }
}


