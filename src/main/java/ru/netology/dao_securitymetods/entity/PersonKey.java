package ru.netology.dao_securitymetods.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PersonKey implements Serializable {

    private String name;

    private String surname;

    private int age;

}