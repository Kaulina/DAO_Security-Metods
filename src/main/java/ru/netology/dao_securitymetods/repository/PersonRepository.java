package ru.netology.dao_securitymetods.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.netology.dao_securitymetods.entity.Person;
import ru.netology.dao_securitymetods.entity.PersonKey;

import java.util.List;
import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, PersonKey> {
    List<Person> findByCityOfLiving(String city);

    List<Person> findByPersonKeyAgeLessThan(int age, Sort sort);

    List<Person> findByPersonKeyNameAndPersonKeySurname(String name, String surname);

    Optional<Person> findFirstByPersonKeyNameAndPersonKeySurname(String name, String surname);

}