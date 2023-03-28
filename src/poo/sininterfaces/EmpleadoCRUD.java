package poo.sininterfaces;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUD {

    // Estrutura de datos de ArrayList
    private List<Empleado> empleados = new ArrayList<>();
    // Operaciones CRUD

    // Agregar empleado en la lista
    public void guardar(Empleado empleado) {
        empleados.add(empleado);
    }
    // Mostrar empleados
    public List<Empleado> findALl() {
        return empleados;
    }

    // Eliminar empleado
    public  void removeEmpleado(Empleado empleado) {
        empleados.remove(empleado);
    }

}
