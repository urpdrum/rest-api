package guia.restapi.domain.input.usuario;

public record CadastrarUsuarioRequest(
        String nome,
        String email,
        String senha,
        String telefone
) {
}
