package com.example.ecommerce.services;

import com.example.ecommerce.models.Envio;
import java.util.List;
import java.util.Optional;
public interface EnvioService {

    Optional<Envio> getEnvioById(Integer id);

    List<Envio> getAllEnvios();

    void deleteAllEnvios();

    void deleteEnvioById(Integer id);

    void updateEnvio(Envio envio);

    void insertEnvio(Envio envio);

}