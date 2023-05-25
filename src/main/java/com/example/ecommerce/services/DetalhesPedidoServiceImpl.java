package com.example.ecommerce.services;
import com.example.ecommerce.repository.*;
import com.example.ecommerce.models.DetalhesPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("detalhesPedidoService")

public class DetalhesPedidoServiceImpl implements DetalhesPedidoService {

    @Autowired
    DetalhesPedidoRepository detalhesPedidoRepository;


    @Override
    public Optional<DetalhesPedido> getDetalhesPedidoById(int id) {
        return detalhesPedidoRepository.findById(id);
    }


    @Override
    public List<DetalhesPedido> getAllDetalhesPedido() {
        return detalhesPedidoRepository.findAll();
    }


    @Override
    public void deleteAllDetalhesPedido() {
        detalhesPedidoRepository.deleteAll();
    }


    @Override
    public void deleteDetalhesPedidoById(Integer id) {
        detalhesPedidoRepository.deleteById(id);
    }


    @Override
    public void updateDetalhesPedido(DetalhesPedido detalhesPedido) {

        if (detalhesPedido.getId() != null) {
            detalhesPedidoRepository.save(detalhesPedido);
        }

    }


    @Override
    public void insertDetalhesPedido(DetalhesPedido detalhesPedido) {

        if (detalhesPedido.getId() == null) {
            detalhesPedidoRepository.save(detalhesPedido);
        }

    }

}