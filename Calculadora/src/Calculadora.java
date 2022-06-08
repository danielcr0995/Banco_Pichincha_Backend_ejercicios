// import java.util.ArrayList;

// package io.github.jiangdequan;

public class Calculadora<T extends Number> {

    private T n1;
    private T n2;
    // private T[] conjunto;
    // ArrayList<T> numeros = new ArrayList<>();

    public Calculadora(T n1, T n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    // public Calculadora(int size) {
    // conjunto = (T[]) new Object[size];
    // }

    // numeros.add(n1)

    public void sumar() {
        if (n1 instanceof Integer) {
            Number resultado = n1.intValue() + n2.intValue();
            System.out.println("La suma de " + n1 + " y " + n2 + " es " + resultado);
            // return resultado;
        } else if (n1 instanceof Float) {
            Number resultado = n1.floatValue() + n2.floatValue();
            System.out.println("La suma de " + n1 + " y " + n2 + " es " + resultado);

        } else if (n1 instanceof Double) {
            Number resultado = n1.doubleValue() + n2.doubleValue();
            System.out.println("La suma de " + n1 + " y " + n2 + " es " + resultado);

        }
        // return n1. n2.intValue();
        // System.out.println("La suma de " + n1 + " y " + n2 + " es " + n1 + n2);
    }

    public void restar() {
        if (n1 instanceof Integer) {
            Number resultado = n1.intValue() - n2.intValue();
            System.out.println("La suma de " + n1 + " y " + n2 + " es " + resultado);
            // return resultado;
        } else if (n1 instanceof Float) {
            Number resultado = n1.floatValue() - n2.floatValue();
            System.out.println("La suma de " + n1 + " y " + n2 + " es " + resultado);

        } else if (n1 instanceof Double) {
            Number resultado = n1.doubleValue() - n2.doubleValue();
            System.out.println("La suma de " + n1 + " y " + n2 + " es " + resultado);

        }
        // return n1. n2.intValue();
        // System.out.println("La suma de " + n1 + " y " + n2 + " es " + n1 + n2);
    }

    public void multiplicar() {
        if (n1 instanceof Integer) {
            Number resultado = n1.intValue() * n2.intValue();
            System.out.println("La suma de " + n1 + " y " + n2 + " es " + resultado);
            // return resultado;
        } else if (n1 instanceof Float) {
            Number resultado = n1.floatValue() * n2.floatValue();
            System.out.println("La suma de " + n1 + " y " + n2 + " es " + resultado);

        } else if (n1 instanceof Double) {
            Number resultado = n1.doubleValue() * n2.doubleValue();
            System.out.println("La suma de " + n1 + " y " + n2 + " es " + resultado);

        }
        // return n1. n2.intValue();
        // System.out.println("La suma de " + n1 + " y " + n2 + " es " + n1 + n2);
    }

    public void dividir() {
        if (n1 instanceof Integer) {
            Number resultado = n1.intValue() / n2.intValue();
            System.out.println("La suma de " + n1 + " y " + n2 + " es " + resultado);
            // return resultado;
        } else if (n1 instanceof Float) {
            Number resultado = n1.floatValue() / n2.floatValue();
            System.out.println("La suma de " + n1 + " y " + n2 + " es " + resultado);

        } else if (n1 instanceof Double) {
            Number resultado = n1.doubleValue() / n2.doubleValue();
            System.out.println("La suma de " + n1 + " y " + n2 + " es " + resultado);

        }
        // return n1. n2.intValue();
        // System.out.println("La suma de " + n1 + " y " + n2 + " es " + n1 + n2);
    }

}