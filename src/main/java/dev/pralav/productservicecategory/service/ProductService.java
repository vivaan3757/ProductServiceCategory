package dev.pralav.productservicecategory.service;

import dev.pralav.productservicecategory.dtos.ProductDto;
import dev.pralav.productservicecategory.models.Product;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


public interface ProductService {
   List<Product> getAllProducts();

   Product getSingleProduct(Long productId);

   Product addProduct(ProductDto productdto);

   Product updateProduct(Long productId,Product product);

   boolean deleteProduct(Long productId);
}
