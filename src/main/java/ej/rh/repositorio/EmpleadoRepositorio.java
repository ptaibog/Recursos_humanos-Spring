package ej.rh.repositorio;

import ej.rh.modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmpleadoRepositorio extends JpaRepository<Empleado, Integer> {
}
