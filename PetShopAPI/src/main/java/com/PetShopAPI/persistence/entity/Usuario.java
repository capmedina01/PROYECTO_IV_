package com.PetShopAPI.persistence.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int usuarioId;

    private String nomUsuario;

    private  String contrasenia;

    private String nombre;

    private String apellido;

    private String email;

    private String telefono;

    private Integer rolId;

    private LocalDateTime fechaRegistro;





}
