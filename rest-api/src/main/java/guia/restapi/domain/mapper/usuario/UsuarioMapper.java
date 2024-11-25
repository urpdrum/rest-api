//package guia.restapi.domain.mapper.usuario;
//
//import guia.restapi.domain.entity.Usuario;
//import guia.restapi.domain.input.usuario.AtualizarUsuarioRequest;
//import guia.restapi.domain.input.usuario.CadastrarUsuarioRequest;
//import guia.restapi.domain.output.usuario.UsuarioResponse;
//
//import org.springframework.web.bind.annotation.Mapping;
//@interface Mapper {
//    String componetModel();
//}
//@Mapper(componetModel = "spring")
//public interface UsuarioMapper {
//
//    /**
//     * @param cadastrarUsuarioRequest
//     * @return
//     */
//    @Mapping(target = "usuarioId", ignore = true)
//    Usuario toUsuario(CadastrarUsuarioRequest cadastrarUsuarioRequest);
//
//    /**
//     * @param atualizarUsuarioRequest
//     * @return
//     */
//    @Mapping(target = "usuarioId", ignore = true)
//    Usuario toUsuario(AtualizarUsuarioRequest atualizarUsuarioRequest);
//
//    /**
//     * @param usuario
//     * @return
//     */
//    UsuarioResponse toUsuarioResponse(Usuario usuario);
//}
//
