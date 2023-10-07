package dev.pralav.productservicecategory.controller;


import dev.pralav.productservicecategory.dtos.ProductDto;
import dev.pralav.productservicecategory.exceptions.NotFoundException;
import dev.pralav.productservicecategory.models.Category;
import dev.pralav.productservicecategory.models.Product;
import dev.pralav.productservicecategory.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;
//    private ProductRepository productRepository;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping()
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{productId}")
    public ResponseEntity<Product> getSingleProduct(@PathVariable("productId") Long productId) throws NotFoundException {
        MultiValueMap<String, String> header = new LinkedMultiValueMap<>();

        header.add("auth-token", "eyJ0eXAiOiJKV1QiLA0KICJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJqb2UiLA0KICJleHAiOjEzMDA4MTkzODAsDQogImh0dHA6Ly9leGFtcGxlLmNvbS9pc19yb290Ijp0cnVlfQ.dBjftJeZ4CVP-mB92K27uhbUJU1p1r_wW1gFWFOEjXk");

        Optional<Product> productOptional = productService.getSingleProduct(productId);

        if(productOptional.isEmpty()) {
            throw new NotFoundException("No Product with product id: "+productId);
        }

        ResponseEntity<Product> response = new ResponseEntity(
                productService.getSingleProduct(productId),
                header,
                HttpStatus.OK);

        return response;
    }

    @PostMapping()
    public ResponseEntity<Product> addProduct(@RequestBody ProductDto product) {

//        Product newProduct = productService.addProduct(product);
        Product newProduct = new Product();
        newProduct.setImageUrl(product.getImageUrl());
        newProduct.setPrice(product.getPrice());
        newProduct.setTitle(product.getTitle());
        newProduct.setDescription(product.getDescription());

        MultiValueMap<String, String> header = new LinkedMultiValueMap<>();
        header.add("auth-token", "eyJ0eXAiOiJKV1QiLA0KICJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJqb2UiLA0KICJleHAiOjEzMDA4MTkzODAsDQogImh0dHA6Ly9leGFtcGxlLmNvbS9pc19yb290Ijp0cnVlfQ.dBjftJeZ4CVP-mB92K27uhbUJU1p1r_wW1gFWFOEjXk");
        ResponseEntity<Product> response = new ResponseEntity(newProduct,header, HttpStatus.CREATED);

        return response;
    }

    @PutMapping("/{productId}")
    public Product updateProduct(@PathVariable("productId") Long productId, @RequestBody ProductDto productDto) {

//        Product updatedProduct = productService.updateProduct(productId,product);
        Product product1 = new Product();
        product1.setId(productDto.getId());
        product1.setCategory(new Category());
        product1.getCategory().setName(productDto.getCategory());
        product1.setPrice(productDto.getPrice());
        product1.setTitle(productDto.getTitle());
        product1.setDescription(productDto.getDescription());
//        MultiValueMap<String, String> header = new LinkedMultiValueMap<>();
//        header.add("auth-token", "eyJ0eXAiOiJKV1QiLA0KICJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJqb2UiLA0KICJleHAiOjEzMDA4MTkzODAsDQogImh0dHA6Ly9leGFtcGxlLmNvbS9pc19yb290Ijp0cnVlfQ.dBjftJeZ4CVP-mB92K27uhbUJU1p1r_wW1gFWFOEjXk");
//        ResponseEntity<Product> response = new ResponseEntity(updatedProduct,header,HttpStatus.OK);

        return productService.updateProduct(productId,product1);
    }

    @DeleteMapping("/{productId}")
    public ResponseEntity<Boolean> deleteProduct(@PathVariable("productId") Long productId) {

        boolean flag = productService.deleteProduct(productId);
        MultiValueMap<String, String> header = new LinkedMultiValueMap<>();
        header.add("auth-token", "eyJ0eXAiOiJKV1QiLA0KICJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJqb2UiLA0KICJleHAiOjEzMDA4MTkzODAsDQogImh0dHA6Ly9leGFtcGxlLmNvbS9pc19yb290Ijp0cnVlfQ.dBjftJeZ4CVP-mB92K27uhbUJU1p1r_wW1gFWFOEjXk");
        ResponseEntity<Boolean> response = new ResponseEntity(flag,header,HttpStatus.OK);

        return response;
    }
}
