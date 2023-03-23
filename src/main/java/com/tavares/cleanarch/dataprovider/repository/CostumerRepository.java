package com.tavares.cleanarch.dataprovider.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tavares.cleanarch.dataprovider.repository.entity.CostumerEntity;

@Repository
public interface CostumerRepository extends MongoRepository<CostumerEntity, String> {
    
}