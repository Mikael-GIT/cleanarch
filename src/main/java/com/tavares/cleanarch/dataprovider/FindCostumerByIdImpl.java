package com.tavares.cleanarch.dataprovider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tavares.cleanarch.core.dataprovider.FindCostumerById;
import com.tavares.cleanarch.core.domain.Costumer;
import com.tavares.cleanarch.dataprovider.repository.CostumerRepository;
import com.tavares.cleanarch.dataprovider.repository.entity.CostumerEntity;
import com.tavares.cleanarch.dataprovider.repository.mapper.CostumerEntityMapper;

@Component
public class FindCostumerByIdImpl implements FindCostumerById {
    
    @Autowired
    private CostumerRepository costumerRepository;

    @Autowired
    private CostumerEntityMapper costumerEntityMapper;

    public Costumer find(String id) throws Exception{
        CostumerEntity costumerEntity = costumerRepository.findById(id).orElseThrow(() -> new Exception("Not was possible to get the costumer"));
        return costumerEntityMapper.toCostumer(costumerEntity);
    }

}