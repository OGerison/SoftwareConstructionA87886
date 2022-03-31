package com.example.financesystem.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.financesystem.model.Category;
import com.example.financesystem.payload.ApiResponse;
import com.example.financesystem.payload.CategoryPayLoad;
import com.example.financesystem.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	CategoryRepository categoryRepository;
	
	public ResponseEntity<?> createCategory(CategoryPayLoad payload){
		
		if(payload.getCategory() != null) {
			
			Optional<Category> cat = payload.getId() != null ?
					categoryRepository.findById(payload.getId()) : Optional.empty();
			
			Category category = cat.isPresent() ? cat.get() : new Category();
			
			category.setName(payload.getCategory());
			
			Category saved = categoryRepository.save(category);
			
			
			if(saved != null) {
				return new ResponseEntity
						(new ApiResponse(true, "Success"), HttpStatus.OK);
			}
  			
		}
		return new ResponseEntity
				(new ApiResponse(false, "Fail"), HttpStatus.FAILED_DEPENDENCY);
	}
	
	
	public String deleteCategory (Long id) {
		Optional<Category> toDelete = id != null ? categoryRepository.findById(id) : Optional.empty();
		if(toDelete.isPresent()) {
			categoryRepository.delete(toDelete.get());
		}
		return "Deleted Succesfully";
	}

}
