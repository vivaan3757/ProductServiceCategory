package dev.pralav.productservicecategory.service;

import dev.pralav.productservicecategory.dtos.ProductDto;
import dev.pralav.productservicecategory.exceptions.NotFoundException;
import dev.pralav.productservicecategory.models.Product;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Optional;


public interface ProductService {
   List<Product> getAllProducts();

   Optional<Product> getSingleProduct(Long productId) throws NotFoundException;

   Product addProduct(ProductDto productdto);

   Product updateProduct(Long productId,Product product);


   boolean deleteProduct(Long productId);
}
