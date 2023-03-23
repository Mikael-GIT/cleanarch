package com.tavares.cleanarch.core.domain;

public class Costumer {

    public Costumer() {
        this.isValidCpf = false;
    }

    public Costumer(String id, String name, String cpf, Address address, Boolean isValidCpf) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.address = address;
        this.isValidCpf = isValidCpf;
    }

    private String id;

    private String name;

    private String cpf;

    private Address address;

    private Boolean isValidCpf;


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Boolean isIsValidCpf() {
        return this.isValidCpf;
    }

    public Boolean getIsValidCpf() {
        return this.isValidCpf;
    }

    public void setIsValidCpf(Boolean isValidCpf) {
        this.isValidCpf = isValidCpf;
    }


}