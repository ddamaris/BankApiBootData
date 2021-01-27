package com.example.BankApi.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "client_id")
    private long clientId;

    private String firstName;
    private String lastName;
    private String login;
    private String password;

    @OneToMany(mappedBy="client", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Account> accounts = new HashSet<>();

    @OneToMany(mappedBy="client", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<BankCard> bankCards = new HashSet<>();

    protected Client() { }
    public Client(String firstName, String lastName, String login, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
    }

    public long getId() {
        return clientId;
    }
    public void setId(long id) {
        this.clientId = id;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Account> getAccounts() {
        return accounts;
    }
    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }

    public Set<BankCard> getBankCards() {
        return bankCards;
    }
    public void setBankCards(Set<BankCard> bankCards) {this.bankCards = bankCards; }

    @Override
    public String toString() {
        return "Client{" + "id=" + clientId + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + '}';
    }
}

