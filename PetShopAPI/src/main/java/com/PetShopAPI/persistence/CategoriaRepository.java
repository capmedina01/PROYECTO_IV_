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

    public List<Category> getAllCategories() {
        try {
           List<Categoria> categorias= (List<Categoria>) categoriaCrudRepository.findAll();
            return mapper.toCategory(categorias);
        }catch (Exception e){
            throw new RuntimeException("Error al consultar las categorias"+e.getMessage());
        }
    }

    public Categoria UpdateCategoria(Categoria categoria){
        try {
            Optional<Categoria> catExist = categoriaCrudRepository.findById(categoria.getCategoriaId());
            if(catExist.isPresent()){
                Categoria cat = catExist.get();
                cat.setNombre(categoria.getNombre());
                cat.setDescripcion(categoria.getDescripcion());

                return categoriaCrudRepository.save(cat);
            }
        }catch (Exception e){
            throw new RuntimeException("Error al actualizar la categoria"+e.getMessage());
        }
        return null;
    }

    public void deleteCategoria(Integer categoriaId){

        try {
            Optional<Categoria> catExist = categoriaCrudRepository.findById(categoriaId);

            if(catExist.isPresent()){
                categoriaCrudRepository.deleteById(categoriaId);
            }
        }catch (Exception e){
            throw new RuntimeException("Error al eliminar la categoria"+e.getMessage());
        }

    }

    @Override
    public Category CreateCategory(Category category) {
        return null;
    }

    @Override
    public Category UpdateCategory(Category category) {
        return null;
    }

    @Override
    public Category DeleteCategory(Category category) {
        return null;
    }

    @Override
    public List<Category> GetAllCategories() {
        return List.of();
    }
}
