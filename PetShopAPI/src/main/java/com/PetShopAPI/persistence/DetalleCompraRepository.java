package com.PetShopAPI.persistence;

import com.PetShopAPI.persistence.crud.DetalleCrompaCrudRepository;
import com.PetShopAPI.persistence.entity.DetalleCompra;
import jakarta.persistence.PersistenceException;

public class DetalleCompraRepository {

    private DetalleCrompaCrudRepository detalleCrompaCrudRepository;

    public DetalleCompra createDetalleCompra (DetalleCompra detalleCompra) {

        try {
            return detalleCrompaCrudRepository.save(detalleCompra);
        }catch (Exception e){
            throw new PersistenceException("Error al crear el detalle de compra"+e.getMessage());
        }
    }
}
