package com.example.ecommerce.services;

import com.example.ecommerce.models.Usuario;
import com.example.ecommerce.repository.UsuarioRepository;
import com.example.ecommerce.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("usuarioService")

public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public Optional<Usuario> getUsuarioById(Integer id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public void deleteAllUsuarios() {
        usuarioRepository.deleteAll();
    }

    @Override
    public void deleteUsuarioById(Integer id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public void updateUsuario(Usuario usuario) {
        if (usuario.getId() != null) {
            usuarioRepository.save(usuario);
        }
    }

    @Override
    public void insertUsuario(Usuario usuario) {
        if (usuario.getId() == null) {
            usuarioRepository.save(usuario);
        }
    }
}