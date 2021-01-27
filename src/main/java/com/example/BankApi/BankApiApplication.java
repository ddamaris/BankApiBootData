package com.example.BankApi;

import com.example.BankApi.models.Client;
import com.example.BankApi.repository.ClientRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class BankApiApplication {

	public static void main(String[] args) {

  	SpringApplication.run(BankApiApplication.class, args);
//		ConfigurableApplicationContext context = SpringApplication.run(BankApiApplication.class);
//		ClientRepository clientRepository = context.getBean(ClientRepository.class);
		// save a couple of clients
//		clientRepository.save(new Client("Jack", "Bauer", "login1", "pass1"));
//		clientRepository.save(new Client("Chloe", "O'Brian", "login2", "pass2"));
//		clientRepository.save(new Client("Kim", "Bauer", "login3", "pass3"));
//		clientRepository.save(new Client("David", "Palmer", "login4", "pass4"));
//		clientRepository.save(new Client("Michelle", "Dessler", "login5", "pass5"));

		// fetch all customers
//		Iterable<Client> clients = clientRepository.findAll();
//		System.out.println("Customers found with findAll():");
//		System.out.println("-------------------------------");
//		for (Client client : clients) {
//			System.out.println(client);
//		}
//		System.out.println();
//
//		// fetch an individual customer by ID
//		Optional<Client> client = clientRepository.findById(1L);
//		System.out.println("Customer found with findOne(1L):");
//		System.out.println("--------------------------------");
//		System.out.println(client);
//		System.out.println();
//
//		// fetch customers by last name
//		List<Client> bauers = clientRepository.findByLastName("Bauer");
//		System.out.println("Customer found with findByLastName('Bauer'):");
//		System.out.println("--------------------------------------------");
//		for (Client bauer : bauers) {
//			System.out.println(bauer);
//		}
//
//		context.close();

	}
}
