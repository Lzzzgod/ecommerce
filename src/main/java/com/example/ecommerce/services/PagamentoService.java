package com.example.ecommerce.services;

import com.example.ecommerce.models.Pagamento;

import java.util.List;
import java.util.Optional;

public interface PagamentoService {

    Optional<Pagamento> getPagamentoById(Integer id);

    List<Pagamento> getAllPagamento();

    void deleteAllPagamento();

    void deletePagamentoById(Integer id);

    void updatePagamento(Pagamento pagamento);

    void insertPagamento(Pagamento pagamento);

}