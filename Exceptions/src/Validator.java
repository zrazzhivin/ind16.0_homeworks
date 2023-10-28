import exception.WrongLoginException;
import exception.WrongPasswordException;

import java.util.regex.Pattern;

public class Validator {

    private static final Pattern LOGIN_PASSWORD_PATTERN = Pattern.compile(
            "[a-zA-Z0-9_] {1,20}"
    );

    public static void validate(
            String login,
            String password,
            String confirmPassword
    ) {
        validateLogin(login);
        validatePassword(password, confirmPassword);
    }

    private static void validateLogin(String login) {
        if (!LOGIN_PASSWORD_PATTERN.matcher(login).matches()) {
            throw new WrongLoginException("Логин содержит недопустимые символы или имеет недопустимую длину");
        }
    }

    private static void validatePassword(String password, String confirmPassword) {
        if (!LOGIN_PASSWORD_PATTERN.matcher(password).matches()) {
            throw new WrongLoginException("Логин содержит недопустимые символы или имеет недопустимую длину");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают!");
        }
    }
}
