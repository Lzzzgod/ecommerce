package com.example.ecommerce.repository;

import com.example.ecommerce.models.Envio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("envioRepository")

public interface EnvioRepository extends JpaRepository<Envio, Integer> {

}