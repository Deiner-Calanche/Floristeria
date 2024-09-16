package com.floristeria.floristeriaapp.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Flor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String tipo;
    private String color;
    private String variedad;
    private int cantidadDisponible;
    private double precioCompra;
    private double precioVenta;
}
