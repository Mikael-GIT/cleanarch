package com.tavares.cleanarch.entrypoint.controller.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CostumerRequest {
    
    @NotBlank
    private String name;

    @NotBlank
    private String cpf;

    @NotBlank
    private String zipCode;

}