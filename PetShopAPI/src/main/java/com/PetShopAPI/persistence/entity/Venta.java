package com.PetShopAPI.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "ventas")
@Data
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ventaId;

    private Integer clienteId;

    private LocalDate fechaVenta;

    private Double total;

    @ManyToOne
    @JoinColumn(name = "ClienteId", insertable = false, updatable = false)
    private Cliente cliente;
}
