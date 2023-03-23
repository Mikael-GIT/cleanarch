package com.tavares.cleanarch.dataprovider.repository.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collation = "costumers")
public class CostumerEntity {

    private String id;

    private String name;

    private String cpf;

    private AddressEntity address;

    private Boolean isValidCpf;
}