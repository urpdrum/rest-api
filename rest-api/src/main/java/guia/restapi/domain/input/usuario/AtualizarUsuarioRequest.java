package guia.restapi.domain.input.usuario;

public record AtualizarUsuarioRequest(
        String nome,
        String email,
        String senha,
        String telefone
) {
}
