package poo.coninterfaces;

public class Empleado {
    // 1. Atributos
    String nombre;
    int edad;
    double salario;
    boolean alta;

    // 2. Constructor

    public Empleado () {
    }
    public Empleado(String nombre, int edad, double salario, boolean alta) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.alta = alta;
    }

    // 3. Métodos


    @Override
    public String toString() {
        return "Nombre: " + nombre
                + " Edad: " + edad
                + " Salario: " + salario
                + " Alta: " + alta;
    }

}
