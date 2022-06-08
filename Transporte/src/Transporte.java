// package io.github.jiangdequan;

public interface Transporte {
    // public int velocidad = 0;

    default public void ponerGasolina() {
        System.out.println("Estamos llenando el tanque de gasolina para empezar el viaje");
    }

    default public void empezarViaje() {
        System.out.println("Estamos empezando el viaje");
    }

    void acelerar(int v);

    void acelerar(int v, int marcha);

    void frenar(int v);

    default void velocidadMax() {
        System.out.println("Estamos en la velocidad maxima");
    };
}