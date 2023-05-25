package com.example.ecommerce.services;

import com.example.ecommerce.models.Itens;
import com.example.ecommerce.repository.ItensRepository;
import com.example.ecommerce.services.ItensService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("ItensService")

public class ItensServiceImpl implements ItensService {
    @Autowired
    ItensRepository itensRepository;

    @Override
    public Optional<Itens> getItensById(Integer id) {
        return itensRepository.findById(id);
    }

    @Override
    public List<Itens> getAllItens() {
        return itensRepository.findAll();
    }

    @Override
    public void deleteAllItens() {
        itensRepository.deleteAll();
    }

    @Override
    public void deleteItensById(Integer id) {
        itensRepository.deleteById(id);
    }

    @Override
    public void updateItens(Itens itens) {
        if (itens.getId() != null) {
            itensRepository.save(itens);
        }
    }

    @Override
    public void insertItens(Itens itens) {
        if (itens.getId() == null) {
            itensRepository.save(itens);
        }
    }
}