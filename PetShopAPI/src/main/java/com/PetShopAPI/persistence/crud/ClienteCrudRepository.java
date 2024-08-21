package com.PetShopAPI.persistence.crud;

import com.PetShopAPI.persistence.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteCrudRepository extends CrudRepository<Cliente, Integer> {
}
