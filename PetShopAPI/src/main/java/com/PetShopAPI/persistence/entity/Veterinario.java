package com.PetShopAPI.persistence.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "vetrinarios")
public class Veterinario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer veterinarioId;

    private Integer usuarioId;

    private String especialidad;

    private String numLicencia;
}
