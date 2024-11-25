package guia.restapi.domain.output.usuario;

public record UsuarioResponse(
        Long usuarioId,
        String nome,
        String email,
        String senha,
        String telefone
) {
}
