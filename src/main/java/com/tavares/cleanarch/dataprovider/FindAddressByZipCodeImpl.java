package com.tavares.cleanarch.dataprovider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tavares.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.tavares.cleanarch.core.domain.Address;
import com.tavares.cleanarch.dataprovider.client.FindAddressByZipCodeClient;
import com.tavares.cleanarch.dataprovider.client.mapper.AddressResponseMapper;
import com.tavares.cleanarch.dataprovider.client.response.AddressResponse;

@Component
public class FindAddressByZipCodeImpl implements FindAddressByZipCode {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        AddressResponse addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
    
}