package arrays;

import java.util.Arrays;

public class ExercicioDeArray {
    static void main() {
        double[] notas = {7.5, 8.0,6.5,9.0,7.0, 3.5, 8.5,5.5,9.5,4.0};
        double soma = 0.0;
        double media = 0.0;
        double maior = 0.0;
        double menor = notas[0];
        int notasAcimaDaMedia = 0;
        for (int i = 0; i<notas.length;i++) {
            System.out.println("Nota " + (i+1) + ": " + notas[i]);
            if(notas[i]>maior) {
                maior = notas[i];
            }
            if(notas[i]<menor) {
                menor = notas[i];
            }
            soma += notas[i];
            media = soma /  notas.length;
        }
        for (int i = 0; i<notas.length;i++) {
            if(notas[i]>media) {
                notasAcimaDaMedia++;
            }
        }
        System.out.println("");
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Notas Acima da media: " + notasAcimaDaMedia);

    }
}
