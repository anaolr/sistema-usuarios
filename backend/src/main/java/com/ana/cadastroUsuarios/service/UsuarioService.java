package com.ana.cadastroUsuarios.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ana.cadastroUsuarios.Repository.UsuarioRepository;
import com.ana.cadastroUsuarios.model.Usuario;

@Service
public class UsuarioService {
    private final UsuarioRepository repository;
    
    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public Usuario salvarUsuario(Usuario usuario) {
        return repository.save(usuario);
    }

    public Usuario atualUsuariorio(Usuario usuario) {
        return repository.save(usuario);
    }

    public void deletarUsuario(Long id) {
        repository.deleteById(id);
    }

    public List<Usuario> listarUsuarios() {
        return repository.findAll();
    }
    
}
