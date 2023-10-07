package dev.pralav.productservicecategory.clients.fakestoreapi;

import dev.pralav.productservicecategory.dtos.ProductDto;
import dev.pralav.productservicecategory.exceptions.NotFoundException;
import dev.pralav.productservicecategory.models.Category;
import dev.pralav.productservicecategory.models.Product;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RequestCallback;
import org.springframework.web.client.ResponseExtractor;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
public class FakeStoreClient {
    private RestTemplateBuilder restTemplateBuilder;


    public FakeStoreClient(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;
    }


    public List<FakeStoreProductDto> getAllProducts() {
        RestTemplate restTemplate = restTemplateBuilder.build();

        ResponseEntity<FakeStoreProductDto[]> response = restTemplate.getForEntity(
                "https://fakestoreapi.com/products",
                FakeStoreProductDto[].class
        );

        return Arrays.asList(response.getBody());
    }


    Optional<FakeStoreProductDto> getSingleProduct(Long productId) throws NotFoundException {
        return null;
    }


    FakeStoreProductDto addProduct(ProductDto product)
    {
        return null;
    }

    FakeStoreProductDto updateProduct(Long productId,Product product)
    {
        return null;
    }



    FakeStoreProductDto deleteProduct(Long productId){
        return null;
    }
}
