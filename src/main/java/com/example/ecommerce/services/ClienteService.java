package com.example.ecommerce.services;
import com.example.ecommerce.models.Cliente;
import java.util.List;
import java.util.Optional;

public interface ClienteService {

    Optional<Cliente> getClienteById(Integer id);

    List<Cliente> getAllClientes();

    void deleteAllClientes();

    void deleteClienteById(Integer id);

    void updateCliente(Cliente cliente);

    void insertCliente(Cliente cliente);

}