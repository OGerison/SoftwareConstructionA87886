package com.example.financesystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.financesystem.model.Expense;
import com.example.financesystem.repository.ExpenseRepository;

@Service
public class ExpenseService {
	
    @Autowired
    private ExpenseRepository expenseRepository;
    
    public Expense addExpense(Expense expenses){
        return expenseRepository.save(expenses);
    }

}
