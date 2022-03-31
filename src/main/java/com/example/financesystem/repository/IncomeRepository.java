package com.example.financesystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.financesystem.model.Income;
import com.example.financesystem.model.User;

public interface IncomeRepository extends JpaRepository<Income, Long>{
	
	// select * from income where user_id = ?1
	List<Income> findByUser(User user);

}
