package com.PetShopAPI.web.controller;

import com.PetShopAPI.domain.Product;
import com.PetShopAPI.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
   @Autowired
    private ProductService productService;

    public List<Product> getProducts() {
        return productService.getProducts();
    }

    public Product CreateProduct(Product product) {
        return productService.CreateProduct(product);
    }
    public Product UpdateProduct(Product product) {

        return productService.UpdateProduct(product);
    }
    public void deleteProduct(Product product) {

    }
}
