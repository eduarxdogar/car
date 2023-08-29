package com.credibanco.conseCar.service;

import com.credibanco.conseCar.dto.ClienteDTO;
import com.credibanco.conseCar.entities.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IClienteService {
    List<ClienteDTO> encontrarTodos(Long consecionarioId);

    public Cliente encontrarporId(Long id);

    void actualizarConcesionario(Cliente concesionario);

    void crearConcesionario(Cliente concesionario);

    void eliminarConcesionario(Long id);



}
