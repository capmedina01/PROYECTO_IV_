package com.PetShopAPI.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "categorias")
@Data
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoriaId;

    private String nombre;

    private String descripcion;
}
