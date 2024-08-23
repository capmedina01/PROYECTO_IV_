package com.PetShopAPI.persistence;

import com.PetShopAPI.persistence.crud.CategoriaCrudRepository;
import com.PetShopAPI.persistence.entity.Categoria;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class CategoriaRepository {

    private CategoriaCrudRepository categoriaCrudRepository;

    public Categoria createCategoria(Categoria categoria){
        try {
            Categoria saved = categoriaCrudRepository.save(categoria);
            return saved;
        }catch (Exception e){
            throw new RuntimeException("Error al crear la categoria"+e.getMessage());
        }
    }

    public List<Categoria> getCategorias() {
        try {
            return (List<Categoria>) categoriaCrudRepository.findAll();
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

}
