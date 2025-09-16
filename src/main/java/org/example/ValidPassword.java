package org.example;

public class ValidPassword {
    public static boolean isValidPassword(String password) {

        if (password.length() < 4 || password.length() > 25) {
            throw new IllegalArgumentException("Password length must be between 4 and 25 characters");
        }

        if (!password.matches("^[a-zA-Z].*")) {
            throw new IllegalArgumentException("Password must start with a letter");
        }

        for (char c : password.toCharArray()) {
            if (!(Character.isLetterOrDigit(c) || c == '_')) {
                throw new IllegalArgumentException("Password can only contain letters, numbers, and underscore");
            }
        }

        int passwordLength = password.length();

        if (password.charAt(passwordLength - 1) == '_') {
            throw new IllegalArgumentException("Password must not end  with a underscore");
        }

        return true;
    }

}


/* Rules
1. The username is between 4 and 25 characters.
2. It must start with a letter.
3. It can only contain letters, numbers, and the underscore character.
4. It cannot end with an underscore character.
If the username is valid then your program should return the string true
*/