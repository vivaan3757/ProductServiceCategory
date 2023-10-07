package dev.pralav.productservicecategory.clients.fakestoreapi;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FakeStoreProductDto {
    private Long id;
    private String title;

    private double price;
    private String description;
    private String imageUrl;
    private String category;

}