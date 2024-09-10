package com.PetShopAPI.persistence.mapper;

import com.PetShopAPI.domain.Category;
import com.PetShopAPI.persistence.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    @Mappings({
            @Mapping(source = "categoriaId", target = "categoryId"),
            @Mapping(source = "nombre", target = "categoryName"),
            @Mapping(source = "descripcion", target = "categoryDescription"),
    })

    Category toCategory(Categoria categoria);

    @InheritInverseConfiguration
    Categoria toCategoria(Category category);
}
