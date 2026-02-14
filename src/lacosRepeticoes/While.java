package lacosRepeticoes;



public class While {
    static void main() {
        int contador = 0;
        while (contador < 5) {
            System.out.println("Contador: " + contador  );
            contador++;


        }

        int senha = 0;
        while (senha != 1234) {
            System.out.println("Digite a Senha: ");
            senha = Integer.parseInt(IO.readln());
        }
            System.out.println("Senha ok! ");


    }
}
