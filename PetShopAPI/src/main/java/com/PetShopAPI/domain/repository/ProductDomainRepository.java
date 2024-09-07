package com.PetShopAPI.domain.repository;

import com.PetShopAPI.domain.Product;


import java.util.List;

public interface ProductDomainRepository {

    Product createProduct(Product product);
    Product updateProduct(Product product);
    List<Product> getAllProducts();
    void deleteProduct(Product product);
}
