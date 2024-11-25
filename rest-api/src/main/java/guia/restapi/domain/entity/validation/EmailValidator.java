package guia.restapi.domain.entity.validation;

import guia.restapi.domain.entity.Usuario;
import guia.restapi.infra.entity.UsuarioEntity;
//import guia.restapi.infra.repository.mapper.UsuarioEntityMapper;

public class EmailValidator {
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

    public static boolean isValid(String email) {
        return email.matches(EMAIL_REGEX);
    }

    private EmailValidator() {
    }}
