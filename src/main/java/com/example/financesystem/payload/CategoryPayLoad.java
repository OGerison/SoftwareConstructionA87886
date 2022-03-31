package com.example.financesystem.payload;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CategoryPayLoad {
	
	private Long id;
	
	@NotNull
	@NotBlank
	private String category;

	public CategoryPayLoad() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	};
	
	

}
