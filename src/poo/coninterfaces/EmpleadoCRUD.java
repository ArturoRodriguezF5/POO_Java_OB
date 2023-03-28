package poo.coninterfaces;

import java.util.List;

public interface EmpleadoCRUD {

    /*
        Se declaran los métodos, pero no se implementan.
     */
    void addEmpleado(Empleado empleado);
    List<Empleado> verEmpleados();
    void delete(Empleado empleado);
}
