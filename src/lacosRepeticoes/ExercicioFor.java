package lacosRepeticoes;

public class ExercicioFor {
    static void main() {
        double[] notas = {8.5, 7.0, 6.5, 9.0, 5.5, 10};
        double maior = 0.0;
        double menor = 10.0;
        int notasMaioresOuIguais7 = 0;
        double somaDasMedias = 0.0;

        System.out.println("==== NOTAS DOS ALUNOS ====");
        for (int i = 0; i < notas.length; i++) {

            System.out.println("Aluno "+(i+1)+" Nota: "+notas[i]);
            somaDasMedias += notas[i] ;
            if (notas[i] > maior) {
                maior = notas[i];
            }
            if (notas[i] < menor) {
                menor = notas[i];
            }
            if(notas[i] >= 7.0) {
                notasMaioresOuIguais7++;
            }
        }
            System.out.println("");
            System.out.println("===== RESULTADO =====");
            System.out.println("Media da turma: "+(somaDasMedias / notas.length));
            System.out.println("Maior nota: "+maior);
            System.out.println("Menor nota: "+menor);
            System.out.println("Notas maiores ou iguais a 7: "+notasMaioresOuIguais7);
    }
}
