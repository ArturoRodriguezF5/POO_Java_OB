package poo.coninterfaces;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUDV1 implements EmpleadoCRUD{
    List<Empleado> empleados = new ArrayList<Empleado>();
    @Override
    public void addEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    @Override
    public List<Empleado> verEmpleados() {
        return empleados;
    }

    @Override
    public void delete(Empleado empleado) {

    }
}
