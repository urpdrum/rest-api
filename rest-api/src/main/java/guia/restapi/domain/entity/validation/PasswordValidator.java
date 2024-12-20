package guia.restapi.domain.entity.validation;

public class PasswordValidator {
    private static final String SENHA_REGEX = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$";

    public static boolean isValid(String password) {
        return password.matches(SENHA_REGEX);
    }

    private PasswordValidator() {
    }
}
