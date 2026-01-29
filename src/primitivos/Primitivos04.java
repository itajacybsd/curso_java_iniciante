package primitivos;

public class Primitivos04 {
    static void main() {
        char letra = 'A';
        System.out.print(letra);

        char numero = '9';
        System.out.println(numero);

        char genero = 'M';

        if (genero == 'M') {
            System.out.println("masculino");
        } else  {
            System.out.println("feminino");

        }

        boolean ligado = true;
        System.out.println("ligado " +ligado);

        int idade = 20;
        boolean maiorIdade = idade > 18;

        System.out.println("maior? " +maiorIdade);


    }
}
