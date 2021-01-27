package com.example.BankApi.repository;

import com.example.BankApi.models.BankCard;
import org.springframework.data.repository.CrudRepository;

public interface CardRepository extends CrudRepository<BankCard, Long> {
}
