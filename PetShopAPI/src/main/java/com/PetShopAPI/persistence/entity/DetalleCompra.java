package com.PetShopAPI.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "detalleCompras")
@Data
public class DetalleCompra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer detalleId;

    private Integer compraId;

    private Integer productoId;

    private Integer cantidad;

    private double precioUnitario;

}