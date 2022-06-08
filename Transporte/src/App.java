public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Avion avion = new Avion();
        avion.ponerGasolina();
        avion.empezarViaje();

        for (int i = 0; i < 10; i++) {
            avion.acelerar(40);
        }

        for (int i = 0; i < 10; i++) {
            avion.acelerar(40, 2);
        }
        for (int i = 0; i < 10; i++) {
            avion.frenar(40);
        }

        Carro carro = new Carro();
        carro.ponerGasolina();
        carro.empezarViaje();

        for (int i = 0; i < 10; i++) {
            carro.acelerar(8);
        }

        for (int i = 0; i < 10; i++) {
            carro.acelerar(8, 2);
        }
        for (int i = 0; i < 10; i++) {
            carro.frenar(16);
        }

    }
}
