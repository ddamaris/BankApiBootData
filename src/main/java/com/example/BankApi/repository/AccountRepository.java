package com.example.BankApi.repository;

import com.example.BankApi.models.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {

}
