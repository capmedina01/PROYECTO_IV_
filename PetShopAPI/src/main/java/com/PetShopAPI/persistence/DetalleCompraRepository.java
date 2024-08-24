package com.PetShopAPI.persistence;

import com.PetShopAPI.persistence.crud.DetalleCrompaCrudRepository;
import com.PetShopAPI.persistence.entity.DetalleCompra;
import jakarta.persistence.PersistenceException;

import java.util.List;
import java.util.Optional;

public class DetalleCompraRepository {

    private DetalleCrompaCrudRepository detalleCrompaCrudRepository;

    public DetalleCompra createDetalleCompra (DetalleCompra detalleCompra) {

        try {
            return detalleCrompaCrudRepository.save(detalleCompra);
        }catch (Exception e){
            throw new PersistenceException("Error al crear el detalle de compra"+e.getMessage());
        }
    }

    public List<DetalleCompra> findAll(){

        try{
            return (List<DetalleCompra>) detalleCrompaCrudRepository.findAll();
        }catch (Exception e){
            throw new PersistenceException("Error al consultar los detalle de compra"+e.getMessage());
        }
    }

    public DetalleCompra updateDetalleCompra (DetalleCompra detalleCompra) {

        try {
            Optional<DetalleCompra> exist = detalleCrompaCrudRepository.findById(detalleCompra.getDetalleId());
            if (exist.isPresent()) {
                DetalleCompra detalle = exist.get();
                detalle.setDetalleId(detalleCompra.getDetalleId());
                detalle.setCompraId(detalleCompra.getCompraId());
                detalle.setCantidad(detalleCompra.getCantidad());
                detalle.setPrecioUnitario(detalleCompra.getPrecioUnitario());
                detalle.setProductoId(detalleCompra.getProductoId());
                return detalleCrompaCrudRepository.save(detalle);
            }
        }catch (Exception e){
            throw new PersistenceException("Error al actualizar el detalle de compra"+e.getMessage());
        }
        return null;
    }

    public void deleteDetalleCompra (DetalleCompra detalleCompra) {

        try {
            Optional<DetalleCompra> exist = detalleCrompaCrudRepository.findById(detalleCompra.getDetalleId());
            if (exist.isPresent()) {
                DetalleCompra detalle = exist.get();
                detalleCrompaCrudRepository.delete(detalle);
            }
        }catch (Exception e){
            throw new PersistenceException("Error al eliminar el detalle de compra"+e.getMessage());
        }
    }
}
