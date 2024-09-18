package com.PetShopAPI.persistence.mapper;

import com.PetShopAPI.domain.Category;
import com.PetShopAPI.domain.Product;
import com.PetShopAPI.persistence.entity.Categoria;
import com.PetShopAPI.persistence.entity.Producto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    @Mappings({
            @Mapping(source = "categoriaId", target = "categoryId"),
            @Mapping(source = "nombre", target = "categoryName"),
            @Mapping(source = "descripcion", target = "categoryDescription"),
    })

    Category toCategory(Categoria categoria);
    List<Category> toCategories(List<Categoria> categorias);

    @InheritInverseConfiguration
    @Mapping(target = "productos", ignore = true)
    Categoria toCategoria(Category category);
}
