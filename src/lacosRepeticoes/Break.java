package lacosRepeticoes;

public class Break {
    static void main() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // para e os demais não sai mais executados
            }
            System.out.println("contador: "+i);

        }

        int contador = 0;
        while (true) {
            contador ++;
            System.out.println("Contador While:  " + contador);
            if (contador == 10) {
                break;
            }
        }
    }
}
