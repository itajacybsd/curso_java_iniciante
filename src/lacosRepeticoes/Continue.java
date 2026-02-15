package lacosRepeticoes;

public class Continue {

    static void main() {
        for (int i = 0; i <= 10; i++) {

            if (i == 2 || i ==5) {
                continue; // nao imprime o 2 e 5
            }
            System.out.println(i);

        }

        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) { //imprime os numeros pares somente
                continue;
            }
                System.out.println("numero par: "+i);
        }
                System.out.println("");

        int[] numeros = {5, -2, 8, -1, 10};

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] <0 ){
                continue;
            }
            System.out.println("Numeros maior que zero: "+numeros[i]);
        }
    }
}
