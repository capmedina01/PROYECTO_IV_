package com.PetShopAPI.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "detalleVentas")
@Data
public class DetalleVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer detalleId;

    private Integer ventaId;

    private int cantidad;

    private Integer productoId;

    private Double precioUnitario;

    private Double subTotal;
}
