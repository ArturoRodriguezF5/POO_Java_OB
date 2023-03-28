package poo.sininterfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {

    EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();

    Empleado paola = new Empleado("Paola", 23, 20000, true);
    Empleado barbara = new Empleado("Barbara", 24, 30000, false);
    Empleado sandra = new Empleado("Sandra", 22, 30000, true);

    // Guardar empleados
    empleadoCRUD.guardar(paola);
    empleadoCRUD.guardar(barbara);
    empleadoCRUD.guardar(sandra);

    // Consultar empleados
    List<Empleado> empleados = empleadoCRUD.findALl();
    System.out.println(empleados);

    empleadoCRUD.removeEmpleado(paola);
        System.out.println(empleados);

    }
}
