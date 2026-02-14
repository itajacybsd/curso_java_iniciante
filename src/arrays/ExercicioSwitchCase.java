package arrays;

import java.util.Scanner;

public class ExercicioSwitchCase {
    static void main() {
        char conceito;
//        Scanner ler = new Scanner(System.in);
        conceito = 'a';
        switch (conceito) {
            case 'A':
                System.out.println("Excelente");
                break;
            case 'B':
                System.out.println("Bom");
                break;
            case 'C':
                System.out.println("Regular");
                break;
            case 'D':
                System.out.println("Ruim");
                break;
            case 'E':
                System.out.println("Reprovado");
                break;
            default:
                System.out.println("Conceito Inválido");
        }

    }
}
