package arrays;

public class ExercicioDeMatrizes {
    static void main() {
        int[][] produtos = new int[3][2];
        produtos[0][0] = 50;
        produtos[0][1] = 20;
        produtos[1][0] = 40;
        produtos[1][1] = 10;
        produtos[2][0] = 60;
        produtos[2][1] = 25;

        int total = 0;

        for (int i = 0; i < produtos.length; i++) {
                int restante = produtos[i][0] - produtos[i][1];
                System.out.println("Produto " + (i + 1) + " | Estoque: " + produtos[i][0] + " | Vendido: " + produtos[i][1] + " | Restante: " + restante) ;
                total += produtos[i][1];

        }
        System.out.println("" );
        System.out.println("Total de itens vendidos: " );
        System.out.println(total );

    }
}
