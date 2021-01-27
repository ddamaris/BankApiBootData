package com.example.BankApi.controller;


import com.example.BankApi.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    public ClientRepository repository;

    @GetMapping("/client")
    public String clientPage(Model model){
        return "client_page";
    }

}
