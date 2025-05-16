package com.snippets;

import java.util.regex.Pattern;

public class Validator {

    // Validates email format using regular expression
    public static boolean isValidEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(email).matches();
    }
}
