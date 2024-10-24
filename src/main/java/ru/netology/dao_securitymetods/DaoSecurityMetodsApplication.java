package ru.netology.dao_securitymetods;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.netology.dao_securitymetods.repository.PersonRepository;

@SpringBootApplication
public class DaoSecurityMetodsApplication implements CommandLineRunner {
    @PersistenceContext
    EntityManager entityManager;

    public DaoSecurityMetodsApplication(PersonRepository personRepository) {

        this.personRepository = personRepository;
    }

    PersonRepository personRepository;

    public static void main(String[] args) {
        SpringApplication.run(DaoSecurityMetodsApplication.class, args);

    }

    @Transactional
    @Override
    public void run(String... args) throws Exception {

    }
}