package com.example.ecommerce.services;
import com.example.ecommerce.models.Pagamento;
import com.example.ecommerce.models.Pedido;

import java.util.List;
import java.util.Optional;

public interface PedidoService {

    Optional<Pedido> getPedidoById(Integer id);

    List<Pedido> getAllPedidos();

    void deleteAllPedidos();

    void deletePedidoById(Integer id);

    void updatePedido(Pedido pedido);

    void insertPedido(Pedido pedido);

}