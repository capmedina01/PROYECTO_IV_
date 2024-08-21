package com.PetShopAPI.persistence.crud;

import com.PetShopAPI.persistence.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioCrudRepository extends CrudRepository<Usuario, Integer> {
}
