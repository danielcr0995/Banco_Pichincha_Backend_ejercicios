// package io.github.jiangdequan;

public class Barco implements Transporte {

    int velocidad = 0;
    int velocidadMaxima = 80;

    public void acelerar(int v, int marcha) {
        if (velocidad >= velocidadMaxima) {
            velocidadMax();
            velocidad = velocidadMaxima;

        } else {
            velocidad += v * marcha;
            System.out.println("Velocidad del barco: " + velocidad);
        }

    }

    public void acelerar(int v) {
        if (velocidad == velocidadMaxima) {
            velocidadMax();
            velocidad = velocidadMaxima;

        } else {
            velocidad += v;
            System.out.println("Velocidad del barco: " + velocidad);
        }
    }

    public void frenar(int v) {
        velocidad -= v;
        System.out.println("Velocidad del barco: " + velocidad);
    }
}