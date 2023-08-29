package com.credibanco.conseCar.repositories;

import com.credibanco.conseCar.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface IClienteRepository extends JpaRepository<Cliente, Long> {
    @Query(value = "SELECT cl FROM Cliente cl WHERE cl.id=id")
     Cliente encontrarTodos(Long consecionarioId);
}
