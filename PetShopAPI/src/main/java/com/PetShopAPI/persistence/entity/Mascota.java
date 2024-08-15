package com.PetShopAPI.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "mascotas")
@Data
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer mascotaId;

    private String nombre;

    private String especie;

    private String raza;

    private Integer edad;

    private Integer clienteId;


}
