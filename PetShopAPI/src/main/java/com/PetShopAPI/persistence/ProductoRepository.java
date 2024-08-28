package com.PetShopAPI.persistence;

import com.PetShopAPI.persistence.crud.ProductoCrudRepository;
import com.PetShopAPI.persistence.entity.Producto;

import java.util.List;
import java.util.Optional;

public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    public Producto createProducto(Producto producto) {

        try {
            return productoCrudRepository.save(producto);
        }catch (Exception e) {
            throw new RuntimeException("Error al crear el producto"+e.getMessage());
        }
    }

    public List<Producto> getAllProducts() {

        try {
            return (List<Producto>) productoCrudRepository.findAll();
        }catch (Exception e) {
            throw new RuntimeException("Error al consultar los productos"+e.getMessage());
        }
    }

    public Producto updateProducto(Producto producto) {

        try{
            Optional<Producto> exist = productoCrudRepository.findById(producto.getProductoId());

            if(exist.isPresent()) {
                Producto existProducto = exist.get();
                existProducto.setNombre(producto.getNombre());
                existProducto.setDescripcion(producto.getDescripcion());
                existProducto.setPrecio(producto.getPrecio());
                return productoCrudRepository.save(existProducto);
            }
        }catch (Exception e) {
            throw new RuntimeException("Error al actualizar el producto"+e.getMessage());
        }
        return null;
    }

    public void deleteProducto(Producto producto) {

        try{
            Optional<Producto> exist = productoCrudRepository.findById(producto.getProductoId());
            if(exist.isPresent()) {
                productoCrudRepository.delete(exist.get());
            }
        }catch (Exception e) {
            throw new RuntimeException("Error al eliminar el producto"+e.getMessage());
        }
    }
}
