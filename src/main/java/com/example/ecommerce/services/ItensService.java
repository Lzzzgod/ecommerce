package com.example.ecommerce.services;

import com.example.ecommerce.models.Itens;

import java.util.List;
import java.util.Optional;

public interface ItensService {

    Optional<Itens> getItensById(Integer id);

    List<Itens> getAllItens();

    void deleteAllItens();

    void deleteItensById(Integer id);

    void updateItens(Itens itens);

    void insertItens(Itens itens);

}