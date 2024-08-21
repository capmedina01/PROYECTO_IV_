package com.PetShopAPI.persistence.crud;

import com.PetShopAPI.persistence.entity.Compra;
import org.springframework.data.repository.CrudRepository;

public interface CompraCrudRepository extends CrudRepository<Compra, Integer> {
}
