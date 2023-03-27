package poo.clases;

public class Vehiculo {

    // Atributos de la clase Vehiculo
    protected String fabricante;
    protected String model;
    protected double cc;
    protected int year;
    protected boolean sport;
    protected int speed;
    protected Motor motor;

    // Constructores de la clase
    public  Vehiculo() {
    }

    public Vehiculo(String fabricante, String model, double cc, int year, boolean sport, int speed, Motor motor) {
        this.fabricante = fabricante;
        this.model = model;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.speed = speed;
        this.motor = motor;
    }

    public Vehiculo (String fabricante, String model) {
        this.fabricante = fabricante;
        this.model = model;
    }

    // Métodos de la clase
    public void acelerar (int quantity) {
        this.speed += quantity;
    }

    // getter y setter

    // ToString
}
