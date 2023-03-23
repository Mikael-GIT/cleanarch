package com.tavares.cleanarch.core.usecase;

import com.tavares.cleanarch.core.domain.Costumer;

public interface FindCostumerByIdUseCase {
    
    public Costumer find(String id) throws Exception;

}