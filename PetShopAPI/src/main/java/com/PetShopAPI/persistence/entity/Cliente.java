package com.PetShopAPI.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "clientes")
@Data
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer clienteId;

    private String nombre;

    private String apellido;

    private String email;

    private String telefono;

    private String direccion;

    private LocalDate fechaRegistro;
}
