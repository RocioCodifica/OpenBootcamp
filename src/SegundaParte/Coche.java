package SegundaParte;

/**
 * @author Rocio
 */
public class Coche {

    public int puertas;

    public Coche(int puertas) {
        this.puertas = puertas;
    }

    public void addPuerta() {
        this.puertas++;
    }

    public void mostrar() {
        System.out.println("El coche tiene " + this.puertas + " puertas.");
    }

}
