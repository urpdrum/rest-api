//package guia.restapi.infra.repository.mapper;
//
//import guia.restapi.domain.entity.Usuario;
//import guia.restapi.infra.entity.UsuarioEntity;
//import org.mapstruct.Mapper;
//import org.mapstruct.factory.Mappers;
//
//@Mapper(componentModel = "spring")
//public interface UsuarioEntityMapper {
//    UsuarioEntityMapper INSTANCE = Mappers.getMapper(UsuarioEntityMapper.class);
//
//    /**
//     * @param usuario
//     * @return
//     */
//    UsuarioEntity toUsuarioEntity(Usuario usuario);
//
//    /**
//     * @param usuarioEntity
//     * @return
//     */
//    Usuario toUsuario(UsuarioEntity usuarioEntity);
//}