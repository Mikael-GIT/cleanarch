package com.tavares.cleanarch.core.usecase.impl;

import com.tavares.cleanarch.core.dataprovider.FindCostumerById;
import com.tavares.cleanarch.core.domain.Costumer;
import com.tavares.cleanarch.core.usecase.FindCostumerByIdUseCase;

public class FindCostumerByIdUseCaseImpl implements FindCostumerByIdUseCase{

    private FindCostumerById findCostumerById;


    public FindCostumerByIdUseCaseImpl() {
    }

    public FindCostumerByIdUseCaseImpl(FindCostumerById findCostumerById) {
        this.findCostumerById = findCostumerById;
    }


    @Override
    public Costumer find(String id) throws Exception {
        return findCostumerById.find(id);
    }
    
}