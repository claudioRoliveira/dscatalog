package com.devsuperior.dscatalog.DTO;

import java.time.Instant;
import java.util.ArrayList;

import java.util.List;
import java.util.Set;

import com.devsuperior.dscatalog.entities.Category;
import com.devsuperior.dscatalog.entities.Product;

public class ProductDTO {

    private long id;
    private String name;
    private double price;
    private String description;
    private String imgUrl;
    private Instant date;

    private List<CategoryDTO> categories = new ArrayList<>();


    public ProductDTO() {
    }

    public ProductDTO(long id, String name, double price, String description, String imgUrl, Instant date) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.imgUrl = imgUrl;
        this.date = date;
    }

    public ProductDTO(Product p) {
        this.id = p.getId();
        this.name = p.getName();
        this.price = p.getPrice();
        this.description = p.getDescription();
        this.imgUrl = p.getImgUrl();
        this.date = p.getDate();
    }

    public ProductDTO(Product p, Set<Category> categories) {
        this(p);
        categories.forEach(x -> this.categories.add(new CategoryDTO(x)));
        
    }


    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgUrl() {
        return this.imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Instant getDate() {
        return this.date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

    public List<CategoryDTO> getCategories() {
        return this.categories;
    }

  
    
}
