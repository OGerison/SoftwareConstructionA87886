package com.example.financesystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.financesystem.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
