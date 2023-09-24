package dev.pralav.productservicecategory.service;

import org.springframework.stereotype.Controller;

@Controller
public class FakeStoreCategoryServiceImpl implements CategoryService {
    @Override
    public String getAllCategories() {
        return null;
    }

    @Override
    public String getProductsInCategory(Long categoryId) {
        return null;
    }
}
