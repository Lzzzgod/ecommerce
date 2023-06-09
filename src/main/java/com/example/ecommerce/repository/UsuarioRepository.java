package com.example.ecommerce.repository;

import com.example.ecommerce.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("usuarioRepository")

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}