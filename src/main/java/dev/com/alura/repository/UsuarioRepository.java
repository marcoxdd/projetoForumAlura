package dev.com.alura.repository;

import dev.com.alura.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<UserDetails> getUsuarioByEmail(String email);
    Optional<Usuario> findById(Long id);
}
