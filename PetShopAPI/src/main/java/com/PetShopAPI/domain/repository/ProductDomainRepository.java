package com.PetShopAPI.domain.repository;

import com.PetShopAPI.domain.dto.ProductDomainDTO;

import java.util.List;

public interface ProductDomainRepository {

    ProductDomainDTO createProduct(ProductDomainDTO product);
    ProductDomainDTO updateProduct(ProductDomainDTO product);
    List<ProductDomainDTO> getAllProducts();
    void deleteProduct(ProductDomainDTO product);
}
