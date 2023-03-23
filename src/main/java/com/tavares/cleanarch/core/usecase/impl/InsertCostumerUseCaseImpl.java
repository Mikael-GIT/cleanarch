package com.tavares.cleanarch.core.usecase.impl;

import com.tavares.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.tavares.cleanarch.core.dataprovider.InsertCostumer;
import com.tavares.cleanarch.core.domain.Address;
import com.tavares.cleanarch.core.domain.Costumer;
import com.tavares.cleanarch.core.usecase.InsertCostumerUseCase;

public class InsertCostumerUseCaseImpl implements InsertCostumerUseCase {

    private FindAddressByZipCode findAddressByZipCode;

    private InsertCostumer insertCostumer;

    public InsertCostumerUseCaseImpl(FindAddressByZipCode findAddressByZipCode, InsertCostumer insertCostumer) {
        this.findAddressByZipCode = findAddressByZipCode;
        this.insertCostumer = insertCostumer;
    }

    @Override
    public void insert(Costumer costumer, String zipCode) {
        Address address = findAddressByZipCode.find(zipCode);
        costumer.setAddress(address);
        insertCostumer.insert(costumer);
    }
    
}