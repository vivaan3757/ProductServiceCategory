package dev.pralav.productservicecategory.controller;

import dev.pralav.productservicecategory.models.Category;
import dev.pralav.productservicecategory.models.Product;
import dev.pralav.productservicecategory.service.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products/categories")
public class CategoryController {

    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping()
    public String getAllCategories() {
        return "Getting all categories";
    }

    @GetMapping("/{categoryId}")
    public String getProductsInCategory(@PathVariable("categoryId") Long categoryId) {
        return "Get products in category";
    }

//    @GetMapping()
//    public List<Category> getAllCategories() {
//        return categoryService.getAllCategories();
//    }
//
//    @GetMapping("/{categoryId")
//    public List<Product> getProductsInCategory(@PathVariable("categoryId") Long categoryId) {
//        return categoryService.getProductsInCategory(categoryId);
//    }
}
