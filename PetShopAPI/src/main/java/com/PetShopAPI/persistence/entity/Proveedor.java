package com.PetShopAPI.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "proveedores")
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer proveedorId;

    private String nombre;

    private String telefono;

    private String email;

    private String direccion;
}
