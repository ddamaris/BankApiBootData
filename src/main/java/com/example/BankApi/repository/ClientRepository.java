package com.example.BankApi.repository;

import com.example.BankApi.models.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClientRepository extends CrudRepository<Client, Long> {
    List<Client> findByLastName(String lastName);
    List<Client> findByFirstName(String firstName);

}
