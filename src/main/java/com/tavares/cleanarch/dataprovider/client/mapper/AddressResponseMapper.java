package com.tavares.cleanarch.dataprovider.client.mapper;

import org.mapstruct.Mapper;

import com.tavares.cleanarch.core.domain.Address;
import com.tavares.cleanarch.dataprovider.client.response.AddressResponse;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {
    
    
    Address toAddress(AddressResponse addressResponse);
}