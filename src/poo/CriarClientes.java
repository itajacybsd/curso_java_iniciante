package poo;

import  poo.Cliente;

public class CriarClientes {

    static void main() {
        Cliente cliente1 = new Cliente();
        cliente1.nome = "Paulo";
        cliente1.saldo = 500;
        cliente1.email = "paulo@gmail.com";

        cliente1.mostrarNome();
        cliente1.mostrarSaldo();
        cliente1.mostrarEmail();

        Cliente cliente2 = new Cliente();
        cliente2.nome = "Jao";
        cliente2.saldo = 1500;
        cliente2.email = "jpaulo@gmail.com";

        cliente2.mostrarNome();
        cliente2.mostrarSaldo();
        cliente2.mostrarEmail();


    }

}
