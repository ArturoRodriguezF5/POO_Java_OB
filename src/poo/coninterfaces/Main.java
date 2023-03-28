package poo.coninterfaces;

import java.util.List;
public class Main {

    static  EmpleadoCRUD empleadoCRUD = new EmpleadoCRUDV1();
    public static void main(String[] args) {

        Empleado roxana = new Empleado("Roxana", 20, 30000, false);
        empleadoCRUD.addEmpleado(roxana);
        System.out.println(empleadoCRUD.verEmpleados());
    }
}
