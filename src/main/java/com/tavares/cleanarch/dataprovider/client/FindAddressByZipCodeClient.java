package com.tavares.cleanarch.dataprovider.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.tavares.cleanarch.dataprovider.client.response.AddressResponse;

@FeignClient(
    name = "FindAddressByZipCodeClient",
    url="https://localhost8082:addresses"
)
public interface FindAddressByZipCodeClient {

    @GetMapping("/{zipCode}")
    AddressResponse find(@PathVariable String zipCode);

}