package com.example.financesystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.financesystem.model.Income;
import com.example.financesystem.repository.IncomeRepository;

@Service
public class IncomeService {
	
    @Autowired
    private IncomeRepository incomeRepository;
    
    public Income addIncome(Income incomes){
        return incomeRepository.save(incomes);
    }

}
