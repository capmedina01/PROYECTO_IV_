package com.PetShopAPI.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer rolId;

    private String nombre;
}
