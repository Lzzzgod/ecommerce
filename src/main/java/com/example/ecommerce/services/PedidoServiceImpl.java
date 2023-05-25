package com.example.ecommerce.services;
import com.example.ecommerce.models.Pedido;
import com.example.ecommerce.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("pedidoService")

public class PedidoServiceImpl implements PedidoService {
    @Autowired
    PedidoRepository pedidoRepository;

    @Override
    public Optional<Pedido> getPedidoById(Integer id) {
        return pedidoRepository.findById(id);
    }

    @Override
    public List<Pedido> getAllPedidos(){
        return pedidoRepository.findAll();
    }

    @Override
    public void deleteAllPedidos() {
        pedidoRepository.deleteAll();
    }

    @Override
    public void deletePedidoById(Integer id) {
        pedidoRepository.deleteById(id);
    }

    @Override
    public void updatePedido(Pedido pedido) {
        if (pedido.getId() != null) {
            pedidoRepository.save(pedido);
        }
    }

    @Override
    public void insertPedido(Pedido pedido) {
        if (pedido.getId() == null) {
            pedidoRepository.save(pedido);
        }
    }
}