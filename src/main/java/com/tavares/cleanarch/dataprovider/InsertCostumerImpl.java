package com.tavares.cleanarch.dataprovider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tavares.cleanarch.core.dataprovider.InsertCostumer;
import com.tavares.cleanarch.core.domain.Costumer;
import com.tavares.cleanarch.dataprovider.repository.CostumerRepository;
import com.tavares.cleanarch.dataprovider.repository.entity.CostumerEntity;
import com.tavares.cleanarch.dataprovider.repository.mapper.CostumerEntityMapper;

@Component
public class InsertCostumerImpl implements InsertCostumer {

    @Autowired
    private CostumerRepository costumerRepository;
    
    @Autowired
    private CostumerEntityMapper costumerEntityMapper;

    @Override
    public void insert(Costumer costumer) {
        CostumerEntity costumerEntity = costumerEntityMapper.toCostumerEntity(costumer);
        costumerRepository.save(costumerEntity);
    }
    
}