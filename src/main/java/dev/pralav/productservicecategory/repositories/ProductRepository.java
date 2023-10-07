package dev.pralav.productservicecategory.repositories;

import dev.pralav.productservicecategory.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product save(Product product);
}
