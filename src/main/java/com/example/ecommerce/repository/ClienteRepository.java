package com.example.ecommerce.repository;
import com.example.ecommerce.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("clienteRepository")

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}