package com.example.ecommerce.services;
import com.example.ecommerce.models.DetalhesPedido;
import java.util.List;
import java.util.Optional;

public interface DetalhesPedidoService {

    Optional<DetalhesPedido> getDetalhesPedidoById(int id);

    List<DetalhesPedido> getAllDetalhesPedido();

    void deleteAllDetalhesPedido();

    void deleteDetalhesPedidoById(Integer id);

    void updateDetalhesPedido(DetalhesPedido detalhesPedido);

    void insertDetalhesPedido(DetalhesPedido detalhesPedido);

}