package com.PetShopAPI.persistence.crud;

import com.PetShopAPI.persistence.entity.DetalleVenta;
import org.springframework.data.repository.CrudRepository;

public interface DetalleVentaCrudRepository extends CrudRepository<DetalleVenta, Integer> {
}
