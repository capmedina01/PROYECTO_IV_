package com.PetShopAPI.domain.service;

import com.PetShopAPI.domain.Product;
import com.PetShopAPI.domain.repository.ProductDomainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
   @Autowired
    private ProductDomainRepository productDomainRepository;

   public List<Product> getProducts() {
       return productDomainRepository.getAllProducts();
   }

   public Product CreateProduct(Product product) {
       return productDomainRepository.createProduct(product);
   }
   public Product UpdateProduct(Product product) {

       return productDomainRepository.updateProduct(product);
   }
   public void deleteProduct(Product product) {

   }



}
