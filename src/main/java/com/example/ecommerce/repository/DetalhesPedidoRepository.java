package com.example.ecommerce.repository;
import com.example.ecommerce.models.DetalhesPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("detalhesPedidoRepository")

public interface DetalhesPedidoRepository extends JpaRepository<DetalhesPedido, Integer> {

}