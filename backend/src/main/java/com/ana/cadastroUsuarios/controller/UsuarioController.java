package com.ana.cadastroUsuarios.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import com.ana.cadastroUsuarios.model.Usuario;
import com.ana.cadastroUsuarios.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class UsuarioController {
    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @GetMapping
    public List<Usuario> listarUsuarios() {
        return service.listarUsuarios();
    }

    @PostMapping
    public Usuario salvarUsuario(@RequestBody Usuario usuario) {
        return service.salvarUsuario(usuario);
    }

}
