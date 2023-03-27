package poo.herencia;

import poo.clases.Motor;
import poo.clases.Vehiculo;

public class Motocicleta extends Vehiculo {

    private boolean baul;

    public Motocicleta() {
    }

    public boolean isBaul() {
        return baul;
    }

    public void setBaul(boolean baul) {
        this.baul = baul;
    }

    public Motocicleta(String fabricante, String model, double cc, int year, boolean sport, int speed, Motor motor, boolean baul) {
        super(fabricante, model, cc, year, sport, speed, motor);
        this.baul = baul;
    }
}
