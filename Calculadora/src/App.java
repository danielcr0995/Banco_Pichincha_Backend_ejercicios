public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Calculadora<Double> numerosd = new Calculadora<>(5.5, 10.1);

        numerosd.sumar();
        numerosd.restar();
        numerosd.dividir();
        numerosd.multiplicar();

        Calculadora<Float> numerosf = new Calculadora<>(0.5f, 0.1f);

        numerosf.sumar();
        numerosf.restar();
        numerosf.dividir();
        numerosf.multiplicar();

        Calculadora<Integer> numeros = new Calculadora<>(20, 5);

        numeros.sumar();
        numeros.restar();
        numeros.dividir();
        numeros.multiplicar();

        // System.out.println(numeros.sumar());
    }
}
