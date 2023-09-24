package dev.pralav.productservicecategory.service;

import dev.pralav.productservicecategory.models.Category;
import dev.pralav.productservicecategory.models.Product;

import java.util.List;

public interface CategoryService {

    String getAllCategories();

    String getProductsInCategory(Long categoryId);
//    List<Category> getAllCategories();
//
//    List<Product> getProductsInCategory(Long categoryId);
}
