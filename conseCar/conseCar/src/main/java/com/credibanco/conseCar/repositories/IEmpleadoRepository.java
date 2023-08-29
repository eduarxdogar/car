package com.credibanco.conseCar.repositories;

import com.credibanco.conseCar.entities.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmpleadoRepository extends JpaRepository<Empleado,Long> {
}
