package arrays;

import java.util.Arrays;

public class Arrays02 {
    static void main() {
        int[] numeros = new int[100];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i +1;
            System.out.println("indice: "+i+ " valor: " + numeros[i]);


        }
    }
}
