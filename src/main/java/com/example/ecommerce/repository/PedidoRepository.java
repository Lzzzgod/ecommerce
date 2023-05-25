package com.example.ecommerce.repository;

import com.example.ecommerce.models.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("pedidoRepository")

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}