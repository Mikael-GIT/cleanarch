package com.tavares.cleanarch.entrypoint.controller.response;



import lombok.Data;

@Data
public class CostumerResponse {

    private String name;

    private String cpf;

    private AddressResponse address;
    
}