package com.tavares.cleanarch.core.dataprovider;

import com.tavares.cleanarch.core.domain.Address;

public interface FindAddressByZipCode {

    Address find(String zipCode);
    
}