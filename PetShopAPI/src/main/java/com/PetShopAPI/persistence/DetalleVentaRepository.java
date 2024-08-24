package com.PetShopAPI.persistence;

import com.PetShopAPI.persistence.crud.DetalleVentaCrudRepository;
import com.PetShopAPI.persistence.entity.DetalleVenta;

import java.util.List;
import java.util.Optional;

public class DetalleVentaRepository {

    private DetalleVentaCrudRepository detalleVentaCrudRepository;

    public DetalleVenta create(DetalleVenta detalleVenta) {

        try {
            return detalleVentaCrudRepository.save(detalleVenta);
        }catch(Exception e) {
            throw new RuntimeException("Error al crear el detalle de la venta"+e.getMessage());
        }
    }

    public List<DetalleVenta> findAll() {

        try {
            return (List<DetalleVenta>) detalleVentaCrudRepository.findAll();
        }catch(Exception e) {
            throw new RuntimeException("Error al consultar los detalle de la venta"+e.getMessage());
        }

    }

    public DetalleVenta updateDetalleVenta(DetalleVenta detalleVenta) {

        try {
            Optional<DetalleVenta> exist = detalleVentaCrudRepository.findById(detalleVenta.getDetalleId());
            if(exist.isPresent()) {
                DetalleVenta detalle = exist.get();

                detalle.setVentaId(detalleVenta.getVentaId());
                detalle.setCantidad(detalleVenta.getCantidad());
                detalle.setProductoId(detalleVenta.getProductoId());
                detalle.setPrecioUnitario(detalleVenta.getPrecioUnitario());
                detalle.setSubTotal(detalleVenta.getSubTotal());
                return detalleVentaCrudRepository.save(detalle);
            }
        }catch(Exception e) {
            throw new RuntimeException("Error al actualizar el detalle de la venta"+e.getMessage());
        }
        return null;
    }

    public void deleteDetalleVenta(DetalleVenta detalleVenta) {

        try{
            Optional<DetalleVenta> exist = detalleVentaCrudRepository.findById(detalleVenta.getDetalleId());
            if(exist.isPresent()) {
                DetalleVenta detalle = exist.get();
                detalleVentaCrudRepository.delete(detalle);
            }

        }catch(Exception e) {
            throw new RuntimeException("Error al eliminar el detalle de la venta"+e.getMessage());
        }
    }
}
