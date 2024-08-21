package com.PetShopAPI.persistence.crud;

import com.PetShopAPI.persistence.entity.Mascota;
import org.springframework.data.repository.CrudRepository;

public interface MascotaCrudRepository extends CrudRepository<Mascota, Integer> {
}
