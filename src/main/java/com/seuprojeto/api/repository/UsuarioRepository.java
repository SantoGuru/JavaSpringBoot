// Caminho: src/main/java/com/seuprojeto/meuapi/repository/UsuarioRepository.java

package com.seuprojeto.api.repository;

import com.seuprojeto.api.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
