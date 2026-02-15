package poo;

public class CriarCarro {
    static void main() {
        Carro carro1 = new Carro();

        carro1.marca = "Renault";
        carro1.modelo = "Sandero";
        carro1.mostrarMarca();
        carro1.mostrarModelo();
        carro1.acelerar();
        carro1.frear();

    }
}
