// package io.github.jiangdequan;

public class Avion implements Transporte {

    public int velocidad = 0;
    public int velocidadMaxima = 200;

    public void acelerar(int v, int marcha) {
        // int velocidad = 0;
        if (velocidad >= velocidadMaxima) {
            velocidadMax();
            velocidad = velocidadMaxima;
        } else {
            velocidad += v * marcha;
            System.out.println("Velocidad del avion: " + velocidad);
        }

    }

    public void acelerar(int v) {
        // float velocidad = 0;
        if (velocidad >= velocidadMaxima) {
            velocidadMax();
            velocidad = velocidadMaxima;

        } else {
            velocidad += v;
            System.out.println("Velocidad del avion: " + velocidad);
        }

    }

    public void frenar(int v) {
        // int velocidad = 0;

        velocidad -= v;
        System.out.println("Velocidad del avion: " + velocidad);
    }
}