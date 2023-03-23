package com.tavares.cleanarch.core.dataprovider;

import com.tavares.cleanarch.core.domain.Costumer;

public interface FindCostumerById {
    
    Costumer find(String id) throws Exception;
}