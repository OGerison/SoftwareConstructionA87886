package com.example.financesystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.financesystem.model.Expense;
import com.example.financesystem.model.User;

public interface ExpenseRepository extends JpaRepository<Expense, Long>{
	
	List<Expense> findByUser(User user);
	
}
