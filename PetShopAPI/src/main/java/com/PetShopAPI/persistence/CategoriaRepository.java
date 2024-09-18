package com.PetShopAPI.persistence;

import com.PetShopAPI.domain.Category;
import com.PetShopAPI.domain.repository.CategoryDomainRepository;
import com.PetShopAPI.persistence.crud.CategoriaCrudRepository;
import com.PetShopAPI.persistence.entity.Categoria;
import com.PetShopAPI.persistence.entity.Producto;
import com.PetShopAPI.persistence.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class CategoriaRepository implements CategoryDomainRepository {

    private CategoriaCrudRepository categoriaCrudRepository;
    private CategoryMapper mapper;

    @Override
    public Category createCategory(Category category){
        try {
            Categoria categoria = mapper.toCategoria(category);
            return mapper.toCategory(categoriaCrudRepository.save(categoria));

        }catch (Exception e){
            throw new RuntimeException("Error al crear la categoria"+e.getMessage());
        }
    }

    @Override
    public List<Category> getAllCategories() {
        try {
           List<Categoria> categorias= (List<Categoria>) categoriaCrudRepository.findAll();
            return mapper.toCategories(categorias);
        }catch (Exception e){
            throw new RuntimeException("Error al consultar las categorias"+e.getMessage());
        }
    }

    @Override
    public Category updateCategory(Category category){
        try {
            Categoria categoria = mapper.toCategoria(category);
            return mapper.toCategory(categoriaCrudRepository.save(categoria));

        }catch (Exception e){
            throw new RuntimeException("Error al actualizar la categoria"+e.getMessage());
        }

    }

    @Override
    public void deleteCategory(Category category){
        try {
            Categoria categoria = mapper.toCategoria(category);
                categoriaCrudRepository.delete(categoria);

        }catch (Exception e){
            throw new RuntimeException("Error al eliminar la categoria"+e.getMessage());
        }

    }

}
