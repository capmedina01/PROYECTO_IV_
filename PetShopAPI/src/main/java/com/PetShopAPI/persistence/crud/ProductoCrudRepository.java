package com.PetShopAPI.persistence.crud;

import com.PetShopAPI.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
}
