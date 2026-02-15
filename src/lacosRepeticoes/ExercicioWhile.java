package lacosRepeticoes;

public class ExercicioWhile {
    static void main() {
        int[] numeros = {5,3,7,15,8,12,20,2};
        int totalPares = 0;
        int totalImpares = 0;
        int somaPares = 0;
        int somaImpares = 0;

        int contador = 0;

        while (contador < numeros.length) {
            System.out.println("Numero: "+numeros[contador]);
            if (numeros[contador] % 2 == 0) {
                somaPares += numeros[contador];
                totalPares++;
            } else {
                somaImpares += numeros[contador];
                totalImpares++;
            }

            contador++;
        }
        System.out.println("==== RESULTADO ====");
        System.out.println("Total de números pares: "+totalPares);
        System.out.println("Total de números impares: "+totalImpares);
        System.out.println("Soma de pares: "+somaPares);
        System.out.println("Soma de impares: "+somaImpares);
    }
}
