package com.example.ecommerce.services;
import com.example.ecommerce.models.Usuario;
import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    Optional<Usuario> getUsuarioById(Integer id);

    List<Usuario> getAllUsuarios();

    void deleteAllUsuarios();

    void deleteUsuarioById(Integer id);

    void updateUsuario(Usuario usuario);

    void insertUsuario(Usuario usuario);

}