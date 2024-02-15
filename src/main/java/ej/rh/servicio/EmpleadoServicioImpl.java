package ej.rh.servicio;

import ej.rh.modelo.Empleado;

import java.util.List;

public interface EmpleadoServicioImpl {
    public List<Empleado> listarEmpleados();

    public Empleado buscarEmpleadoPorId(Integer idEmpleado);

    public  Empleado guardarEmpleado(Empleado empleado);

    public  void eliminarEmpleado(Empleado empleado);
}
