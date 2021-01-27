package com.example.BankApi.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Account implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "account_id")
    private Long accountId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="client_id", nullable=false)
    private Client client;

    @OneToMany(mappedBy="client", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<BankCard> bankCards;

    private Integer accNumber;
    private Integer amount;

    public Account() { }

    public Account(Integer accNumber, Integer amount) {
        this.accNumber = accNumber;
        this.amount = amount;
    }

    public Long getId() { return accountId; }
    public void setId(Long id) { this.accountId = id; }

    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }

    public Set<BankCard> getBankCards() { return bankCards; }
    public void setBankCards(Set<BankCard> bankCards) { this.bankCards = bankCards; }

    public Integer getAccNumber() { return accNumber; }
    public void setAccNumber(Integer accNumber) { this.accNumber = accNumber; }

    public Integer getAmount() { return amount; }
    public void setAmount(Integer amount) { this.amount = amount; }

    @Override
    public String toString() {
        return "{\"id\": " + accountId + ", \"client\": " + client + ", \"number\": " + accNumber + ", \"amount\" :" + amount + '}';
    }
}
