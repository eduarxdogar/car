package com.credibanco.conseCar.dto;

import com.credibanco.conseCar.entities.Consecionario;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
public class EmpleadoDTO {

    private Long id;

    private String nombre;

    private String apellido;

    private int telCorporativo;

    private String correoCorporativo;

}
