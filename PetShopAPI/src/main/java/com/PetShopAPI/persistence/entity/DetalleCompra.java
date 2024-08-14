package com.PetShopAPI.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "detalleCompra")
public class DetalleCompra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer detalleId;
}