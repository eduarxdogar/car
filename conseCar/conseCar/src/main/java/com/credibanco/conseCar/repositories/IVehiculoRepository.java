package com.credibanco.conseCar.repositories;

import com.credibanco.conseCar.entities.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVehiculoRepository extends JpaRepository<Vehiculo,Long> {
}
