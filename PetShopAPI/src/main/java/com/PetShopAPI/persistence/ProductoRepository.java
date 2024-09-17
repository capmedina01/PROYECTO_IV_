package com.PetShopAPI.persistence;

import com.PetShopAPI.domain.Product;
import com.PetShopAPI.domain.repository.ProductDomainRepository;
import com.PetShopAPI.persistence.crud.ProductoCrudRepository;
import com.PetShopAPI.persistence.entity.Producto;
import com.PetShopAPI.persistence.mapper.ProductMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository implements ProductDomainRepository {

    private ProductoCrudRepository productoCrudRepository;
    private ProductMapper mapper;

    public Producto createProducto(Producto producto) {

        try {
            return productoCrudRepository.save(producto);
        }catch (Exception e) {
            throw new RuntimeException("Error al crear el producto"+e.getMessage());
        }
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public Product updateProduct(Product product) {
        return null;
    }

    public List<Product> getAllProducts() {
        try {
            List<Producto> productos = (List<Producto>) productoCrudRepository.findAll();
            return mapper.toProducts(productos);
        }catch (Exception e) {
            throw new RuntimeException("Error al consultar los productos"+e.getMessage());
        }
    }

    @Override
    public void deleteProduct(Product product) {

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
