package com.tavares.cleanarch.entrypoint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tavares.cleanarch.core.domain.Costumer;
import com.tavares.cleanarch.core.usecase.FindCostumerByIdUseCase;
import com.tavares.cleanarch.core.usecase.InsertCostumerUseCase;
import com.tavares.cleanarch.entrypoint.controller.mapper.CostumerMapper;
import com.tavares.cleanarch.entrypoint.controller.request.CostumerRequest;
import com.tavares.cleanarch.entrypoint.controller.response.CostumerResponse;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/costumers")
public class CostumerController {
    
    @Autowired
    private InsertCostumerUseCase insertCostumerUseCase;

    @Autowired
    private FindCostumerByIdUseCase findCostumerByIdUseCase;

    @Autowired
    private CostumerMapper costumerMapper;

    @GetMapping("/{id}")
    public ResponseEntity<CostumerResponse> findById(@PathVariable String id) throws Exception{
        Costumer costumer = findCostumerByIdUseCase.find(id);
        return ResponseEntity.ok(costumerMapper.tCostumerResponse(costumer));
    }

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CostumerRequest costumerRequest){
        Costumer costumer = costumerMapper.toCostumer(costumerRequest); 
        insertCostumerUseCase.insert(costumer, costumerRequest.getZipCode());
        return ResponseEntity.ok().build();
    }
}