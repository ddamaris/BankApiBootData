package com.example.BankApi.models;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@JsonInclude
@Entity
public class BankCard implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "card_id")
    private long cardId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="client_id", nullable=false)
    private Client client;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="account_id", nullable=false)
    private Account account;

    private String bankCardNum;
    private int amount;

    public BankCard(){ }

    public BankCard(String number, int amount) {
        this.bankCardNum = number;
        this.amount = amount;
    }

    public Long getId() {
        return cardId;
    }
    public void setId(long id) {
        this.cardId = id;
    }

    public Client getOwnerId() {
        return client;
    }
    public void setOwnerId(Client owner) { this.client = owner; }

    public Account getAccount() {
        return account;
    }
    public void setAccount(Account account) {
        this.account = account;
    }

    public String getBankCardNum() {
        return bankCardNum;
    }
    public void setBankCardNum(String bankCardNum) {
        this.bankCardNum = bankCardNum;
    }

    public Integer getAmount() { return amount; }
    public void setAmount(int amount) { this.amount = amount; }

    public boolean equals(BankCard bankCard) {
        if (this == bankCard) return true;
        if (bankCard == null || getClass() != bankCard.getClass()) return false;
        return Objects.equals(client.getId(), bankCard.client.getId()) &&
               Objects.equals(account.getId(), bankCard.account.getId()) &&
               Objects.equals(bankCardNum, bankCard.bankCardNum) &&
               Objects.equals(amount, bankCard.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardId, client.getId(), account.getId());
    }

    @Override
    public String toString() {
        return "{\"id\": " + cardId + ", \"ownerId\": " + client.getId() + ", \"accountId\": " + account.getId() + "," +
                " \"cardNumber\": " + bankCardNum + ", \"amount\": " + amount + "}";
    }
}
