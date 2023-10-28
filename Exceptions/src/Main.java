import exception.WrongLoginException;
import exception.WrongPasswordException;

public class Main {
    public static void main(String[] args) {

        String login = "login1231111111111111111111";
        String password = "password123";
        String confirmPassword = "password123";

        try {
            Validator.validate(login, password, confirmPassword);
            System.out.println("Валидация прошла успешно!");
        } catch (WrongLoginException wrongLoginException) {
            wrongLoginException.printStackTrace();
        } catch (WrongPasswordException wrongPasswordException) {
            wrongPasswordException.printStackTrace();
        }

        System.out.println("Валидация завершилась");
    }
}