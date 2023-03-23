package com.tavares.cleanarch.core.usecase;

import com.tavares.cleanarch.core.domain.Costumer;

public interface InsertCostumerUseCase {
    
    void insert(Costumer costumer, String zipCode);
}