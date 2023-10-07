package dev.pralav.productservicecategory.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Product extends BaseModel {
    private String title;
    private double price;
    private String description ;
    private String imageUrl;
    private Category category;

}
