package com.example.ecommerce.services;

import com.example.ecommerce.models.Pagamento;
import com.example.ecommerce.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("pagamentoService")

public class PagamentoServiceImpl implements PagamentoService {

    @Autowired
    PagamentoRepository pagamentoRepository;


    @Override
    public Optional<Pagamento> getPagamentoById(Integer id) {

        return pagamentoRepository.findById(id);

    }

    @Override
    public List<Pagamento> getAllPagamento() {

        return pagamentoRepository.findAll();

    }

    @Override
    public void deleteAllPagamento() {

        pagamentoRepository.deleteAll();

    }

    @Override
    public void deletePagamentoById(Integer id) {

        pagamentoRepository.deleteById(id);

    }

    @Override
    public void updatePagamento(Pagamento pagamento) {

        if (pagamento.getId() != null) {

            pagamentoRepository.save(pagamento);

        }

    }

    @Override
    public void insertPagamento(Pagamento pagamento) {

        if (pagamento.getId() == null) {

            pagamentoRepository.save(pagamento);

        }

    }

}