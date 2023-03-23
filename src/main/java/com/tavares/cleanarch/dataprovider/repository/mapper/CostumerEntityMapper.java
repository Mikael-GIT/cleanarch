package com.tavares.cleanarch.dataprovider.repository.mapper;

import java.util.function.Consumer;

import org.mapstruct.Mapper;

import com.tavares.cleanarch.core.domain.Costumer;
import com.tavares.cleanarch.dataprovider.repository.entity.CostumerEntity;

@Mapper(componentModel = "spring")
public interface CostumerEntityMapper {
    
    CostumerEntity toCostumerEntity(Costumer costumer);

}