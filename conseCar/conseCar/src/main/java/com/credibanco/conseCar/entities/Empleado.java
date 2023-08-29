package com.credibanco.conseCar.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "empelados")
@Data
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "idempelado")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "telcorporativo")
    private int telCorporativo;

    @Column(name = "correocoporativo")
    private String correoCorporativo;

    @ManyToOne
    @JoinColumn(name = "consecionario_id")
    private Consecionario consecionario;

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telCorporativo=" + telCorporativo +
                ", correoCorporativo='" + correoCorporativo + '\'' +
                ", consecionario=" + consecionario +
                '}';
    }
}
