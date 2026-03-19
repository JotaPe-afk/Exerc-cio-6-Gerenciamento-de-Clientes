package com.jp.demo.services;

import com.jp.demo.models.ClienteModel;
import com.jp.demo.repositories.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private ClienteRepository clienteRepository;

    public ClienteModel cadastrar(ClienteModel cliente){
        return clienteRepository.save(cliente);
    }

    public List<ClienteModel> findAll(){
        return clienteRepository.findAll();
    }

    public ClienteModel buscar(Long id){
        return clienteRepository.findById(id).get();
    }

    public void delete(ClienteModel cliente){
        clienteRepository.delete(cliente);
    }
}
