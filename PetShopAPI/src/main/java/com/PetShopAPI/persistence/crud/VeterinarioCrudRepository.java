package com.PetShopAPI.persistence.crud;

import com.PetShopAPI.persistence.entity.Veterinario;
import org.springframework.data.repository.CrudRepository;

public interface VeterinarioCrudRepository extends CrudRepository<Veterinario, Integer> {
}
