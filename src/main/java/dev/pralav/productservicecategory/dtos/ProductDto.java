package dev.pralav.productservicecategory.dtos;

import dev.pralav.productservicecategory.models.Category;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProductDto {
    private Long id;
    private String title;

    private double price;
    private String description;
    private String imageUrl;
    private String category;

}
