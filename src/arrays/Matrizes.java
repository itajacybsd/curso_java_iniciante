package arrays;

import java.util.Arrays;

public class Matrizes {
    static void main() {
        int[][] matrizSimples = new int[2][2];
        matrizSimples[0][0] = 1;
        matrizSimples[0][1] = 2;
        matrizSimples[1][0] = 3;
        matrizSimples[1][1] = 4;

        System.out.println(matrizSimples[0][0]);
        System.out.println(matrizSimples[0][1]);
        System.out.println(matrizSimples[1][0]);
        System.out.println(matrizSimples[1][1]);

        int[][] matrizEmLinha = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}
        };

        System.out.println(Arrays.deepToString(matrizEmLinha));

        System.out.println(matrizEmLinha[2][1]);

        for (int i = 0; i < matrizEmLinha.length; i++) {
            String linha = "";
            for (int j = 0; j < matrizEmLinha[i].length; j++) {
                linha += " | " + matrizEmLinha[i][j];
            }
            System.out.println(linha);
        }

    }
}
