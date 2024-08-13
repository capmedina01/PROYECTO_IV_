package com.PetShopAPI.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Productos")
public class Producto {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productoId;

    private String nombre;

    private String descripcion;

    private double precio;

    private Integer stock;

    private Integer categoriaId;

}
