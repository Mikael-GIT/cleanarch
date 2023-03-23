package com.tavares.cleanarch.entrypoint.controller.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.tavares.cleanarch.core.domain.Costumer;
import com.tavares.cleanarch.entrypoint.controller.request.CostumerRequest;
import com.tavares.cleanarch.entrypoint.controller.response.CostumerResponse;

@Mapper(componentModel = "spring")
public interface CostumerMapper {
    
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Costumer toCostumer(CostumerRequest costumerRequest);

    @Mapping(target= "isValidCpf", ignore = true)
    @Mapping(target = "id", ignore = true)
    CostumerResponse tCostumerResponse(Costumer costumer);
}