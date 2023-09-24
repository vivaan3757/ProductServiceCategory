package dev.pralav.productservicecategory.controller;


import dev.pralav.productservicecategory.dtos.ProductDto;
import dev.pralav.productservicecategory.models.Product;
import dev.pralav.productservicecategory.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping()
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{productId}")
    public ResponseEntity<Product> getSingleProduct(@PathVariable("productId") Long productId) {
        MultiValueMap<String, String> header = new LinkedMultiValueMap<>();

        header.add("auth-token", "eyJ0eXAiOiJKV1QiLA0KICJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJqb2UiLA0KICJleHAiOjEzMDA4MTkzODAsDQogImh0dHA6Ly9leGFtcGxlLmNvbS9pc19yb290Ijp0cnVlfQ.dBjftJeZ4CVP-mB92K27uhbUJU1p1r_wW1gFWFOEjXk");

        ResponseEntity<Product> response = new ResponseEntity(
                productService.getSingleProduct(productId),
                header,
                HttpStatus.OK);

        return response;
    }

    @PostMapping()
    public ResponseEntity<Product> addProduct(@RequestBody ProductDto product) {

        Product newProduct = productService.addProduct(product);
        MultiValueMap<String, String> header = new LinkedMultiValueMap<>();
        header.add("auth-token", "eyJ0eXAiOiJKV1QiLA0KICJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJqb2UiLA0KICJleHAiOjEzMDA4MTkzODAsDQogImh0dHA6Ly9leGFtcGxlLmNvbS9pc19yb290Ijp0cnVlfQ.dBjftJeZ4CVP-mB92K27uhbUJU1p1r_wW1gFWFOEjXk");
        ResponseEntity<Product> response = new ResponseEntity(newProduct,header, HttpStatus.CREATED);

        return response;
    }

    @PutMapping("/{productId}")
    public ResponseEntity<Product> updateProduct(@PathVariable("productId") Long productId, @RequestBody Product product) {

        Product updatedProduct = productService.updateProduct(productId,product);
        MultiValueMap<String, String> header = new LinkedMultiValueMap<>();
        header.add("auth-token", "eyJ0eXAiOiJKV1QiLA0KICJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJqb2UiLA0KICJleHAiOjEzMDA4MTkzODAsDQogImh0dHA6Ly9leGFtcGxlLmNvbS9pc19yb290Ijp0cnVlfQ.dBjftJeZ4CVP-mB92K27uhbUJU1p1r_wW1gFWFOEjXk");
        ResponseEntity<Product> response = new ResponseEntity(updatedProduct,header,HttpStatus.OK);

        return response;
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
