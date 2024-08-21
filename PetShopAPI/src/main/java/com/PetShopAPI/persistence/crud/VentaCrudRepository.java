package com.PetShopAPI.persistence.crud;

import com.PetShopAPI.persistence.entity.Venta;
import org.springframework.data.repository.CrudRepository;

public interface VentaCrudRepository extends CrudRepository<Venta, Integer> {
}
