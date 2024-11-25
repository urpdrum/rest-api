package guia.restapi.infra.entity;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class UsuarioEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long usuarioId;
        @NonNull
        private String nome;
        @NonNull
        private String email;
        @NonNull
        private String senha;
        @NonNull
        private String telefone;
}
