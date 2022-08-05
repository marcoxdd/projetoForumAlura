package dev.com.alura.services;

import dev.com.alura.modelo.Usuario;
import dev.com.alura.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AutenticacaoService implements UserDetailsService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserDetails> usuario = usuarioRepository.getUsuarioByEmail(username);
        if (usuario.isPresent()) return usuario.get();
        throw new UsernameNotFoundException("Usuario não encontrado");
    }
}
