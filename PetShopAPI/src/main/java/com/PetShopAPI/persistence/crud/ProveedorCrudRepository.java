package com.PetShopAPI.persistence.crud;

import com.PetShopAPI.persistence.entity.Proveedor;
import org.springframework.data.repository.CrudRepository;

public interface ProveedorCrudRepository extends CrudRepository<Proveedor, Integer> {
}
