package poo.clases;

import poo.herencia.Motocicleta;

public class Main {
    public static void main(String[] args) {

    /*// Vehiculo vehiculo = new Vehiculo();
    Vehiculo toyotaPrius = new Vehiculo();

    // Crear un motor para pasarlo como parametro
    Motor GTI = new Motor("GTI", 350, 459, 8);

    // Crear un Vehiculo con parametros
    Vehiculo fordMondeo = new Vehiculo("ford","Mondeo", 2.1, 2010, false, 0, GTI);
        System.out.println(fordMondeo.fabricante);
        System.out.println(fordMondeo.year);
        System.out.println(fordMondeo.speed);
        fordMondeo.acelerar(50);
        System.out.println(fordMondeo.speed);*/

    Motocicleta kawasakiNinja = new Motocicleta();
    kawasakiNinja.fabricante = "Kawasaki";
    kawasakiNinja.setBaul(true);
        System.out.println(kawasakiNinja.isBaul());

    }
}
