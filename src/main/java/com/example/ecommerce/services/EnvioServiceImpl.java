package com.example.ecommerce.services;
import com.example.ecommerce.models.Envio;
import com.example.ecommerce.models.Usuario;
import com.example.ecommerce.repository.EnvioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("EnvioService")

public class EnvioServiceImpl implements EnvioService {

    @Autowired
    EnvioRepository envioRepository;

    @Override
    public Optional<Envio> getEnvioById(Integer id) {
        return envioRepository.findById(id);
    }

    @Override
    public List<Envio> getAllEnvios() {
        return envioRepository.findAll();
    }

    @Override
    public void deleteAllEnvios() {
        envioRepository.deleteAll();
    }

    @Override
    public void deleteEnvioById(Integer id) {
        envioRepository.deleteById(id);
    }

    @Override
    public void updateEnvio(Envio envio) {
        if (envio.getId() != null) {
            envioRepository.save(envio);
        }
    }
    @Override
    public void insertEnvio(Envio envio) {
        if (envio.getId() == null) {
            envioRepository.save(envio);
        }
    }
}