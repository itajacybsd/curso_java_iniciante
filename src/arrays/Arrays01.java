package arrays;

import java.util.Arrays;

public class Arrays01 {
    static void main() {
        int[] x = new int[3];
        x[0] = 10;
        x[1] = 20;
        x[2] = 30;
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);

        int[] y = {40,50,60};
        System.out.println(y[0]);
        System.out.println(y[1]);
        System.out.println(y[2]);

        String[] frutas = {"maca","melao","melancia"};
        System.out.println(frutas[0]);
        System.out.println(frutas[1]);
        System.out.println(frutas[2]);

        double[] notas = { 9.5, 5.5,3.0};

        System.out.println(notas[0]);
        System.out.println(notas[1]);
        System.out.println(notas[2]);

        double media = (Arrays.stream(notas).sum())/ notas.length;

        System.out.println(media);


    }
}
