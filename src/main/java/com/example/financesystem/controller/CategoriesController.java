package com.example.financesystem.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.financesystem.payload.CategoryPayLoad;
import com.example.financesystem.repository.CategoryRepository;
import com.example.financesystem.security.CurrentUser;
import com.example.financesystem.security.UserPrincipal;
import com.example.financesystem.services.CategoryService;

import com.example.financesystem.model.Category;

@RestController
@RequestMapping("/api/categories")
public class CategoriesController {
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@PostMapping("/create")
	public ResponseEntity<?> createCategory(@CurrentUser UserPrincipal User, 
			@Valid @RequestBody CategoryPayLoad payLoad){
		
		return categoryService.createCategory(payLoad);
		
	}
	
	@GetMapping("/getall")
	public List<Category> getAllCategories(){
		
		return categoryRepository.findAll();
		
	}
	
	@DeleteMapping("/categorydelete/{id}")
	public String deleteCategoryById(@PathVariable("id") Long id)
	{
		return categoryService.deleteCategory(id);
	}

}




