package com.example.ecommerce.services;

import com.example.ecommerce.models.Cliente;
import com.example.ecommerce.repository.ClienteRepository;
import com.example.ecommerce.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("ClienteService")

public class ClienteServiceImpl implements ClienteService {


    @Autowired

    ClienteRepository clienteRepository;


    @Override

    public Optional<Cliente> getClienteById(Integer id) {

        return clienteRepository.findById(id);

    }


    @Override

    public List<Cliente> getAllClientes() {

        return clienteRepository.findAll();

    }


    @Override

    public void deleteAllClientes() {

        clienteRepository.deleteAll();

    }


    @Override

    public void deleteClienteById(Integer id) {

        clienteRepository.deleteById(id);

    }


    @Override

    public void updateCliente(Cliente cliente) {

        if (cliente.getId() != null) {

            clienteRepository.save(cliente);

        }

    }


    @Override

    public void insertCliente(Cliente cliente) {

        if (cliente.getId() == null) {

            clienteRepository.save(cliente);

        }

    }

}