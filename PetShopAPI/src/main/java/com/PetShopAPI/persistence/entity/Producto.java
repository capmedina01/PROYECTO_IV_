package com.PetShopAPI.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Productos")
@Data
public class Producto {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productoId;

    private String nombre;

    private String descripcion;

    private double precio;

    private Integer stock;

    private Integer categoriaId;

    @ManyToOne
    @JoinColumn(name = "categoriaId", insertable = false, updatable = false)
    private Categoria categoria;

}
