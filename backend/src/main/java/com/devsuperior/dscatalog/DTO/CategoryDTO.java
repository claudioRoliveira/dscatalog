package com.devsuperior.dscatalog.DTO;

import com.devsuperior.dscatalog.entities.Category;

public class CategoryDTO {
	
	private long id;
	private String name;
	
	public CategoryDTO() {
		
	}

	public CategoryDTO(Category category) {
		this.id = category.getId();
		this.name = category.getName();
	}
	
	public CategoryDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
