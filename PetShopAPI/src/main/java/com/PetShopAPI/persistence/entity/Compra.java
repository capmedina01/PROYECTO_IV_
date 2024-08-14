package com.PetShopAPI.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "compras")
@Data
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer compraId;

    private Integer proveedorId;

    private LocalDateTime fechaCompra;

    private Double total;
}
