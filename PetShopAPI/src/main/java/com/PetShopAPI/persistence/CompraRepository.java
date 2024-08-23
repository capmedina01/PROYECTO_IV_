package com.PetShopAPI.persistence;

import com.PetShopAPI.persistence.crud.CompraCrudRepository;
import com.PetShopAPI.persistence.entity.Compra;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceException;

import java.util.List;
import java.util.Optional;

public class CompraRepository {

    private CompraCrudRepository compraCrudRepository;

    public Compra createCompra(Compra compra) {

        try {
            return compraCrudRepository.save(compra);
        }catch (Exception e){
            throw new RuntimeException("Error al crear la compra"+e.getMessage());
        }
    }
    public List<Compra> findAll() {

        try{
            return (List<Compra>) compraCrudRepository.findAll();

        }catch (Exception e){
            throw new RuntimeException("Error al consultar las compras"+e.getMessage());
        }
    }

    public Compra updateCompra(Compra compra) {

        try {

            Optional<Compra> exist = compraCrudRepository.findById(compra.getCompraId());

            if(exist.isPresent()){
                Compra compraSaved = exist.get();
                compraSaved.setProveedorId(compra.getProveedorId());
                compraSaved.setFechaCompra(compra.getFechaCompra());
                compraSaved.setTotal(compra.getTotal());

                return compraCrudRepository.save(compraSaved);

            }
        }catch (PersistenceException e){
            throw new RuntimeException("Error al actualizar la compra"+e.getMessage());
        }
        return null;
    }

    public void deleteCompra(Compra compra) {

        try{
            compraCrudRepository.deleteById(compra.getCompraId());

        }catch (Exception e){
            throw new RuntimeException("Error al eliminar la compra"+e.getMessage());
        }
    }
}
