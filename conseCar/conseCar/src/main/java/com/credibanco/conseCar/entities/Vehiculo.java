package com.credibanco.conseCar.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "vehiculos")
@Data
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "idcliente")
    private Long id;

    @Column(name = "tipoVehiculo")
    private String tipo;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "anofabricacion")
    private int anoFabricacion;

    @Column(name = "precionuevo")
    private double precioNuevo;

    @Column(name = "preciousado")
    private double precioUsado;

    @Override
    public String toString() {
        return "Vehiculo{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anoFabricacion=" + anoFabricacion +
                ", precioNuevo=" + precioNuevo +
                ", precioUsado=" + precioUsado +
                '}';
    }
}
