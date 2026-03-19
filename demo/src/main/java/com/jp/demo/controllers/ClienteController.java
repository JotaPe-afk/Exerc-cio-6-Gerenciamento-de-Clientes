package com.jp.demo.controllers;

import com.jp.demo.models.ClienteModel;
import com.jp.demo.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ClienteModel cadastrar(ClienteModel cliente){
        return clienteService.cadastrar(cliente);
    }

    @GetMapping
    public List<ClienteModel> findAll(){
        return clienteService.findAll();
    }

    @GetMapping("/{id}")
    public ClienteModel buscar(Long id){
        return clienteService.buscar(id);
    }

    @DeleteMapping
    public void delete(Long id){
        clienteService.delete(id);
    }
}
