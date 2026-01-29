package primitivos;

public class Primitivos02 {
    static void main() {
        int idade = 27;
        System.out.println("idade: " + idade);

        if (idade >= 18) {
            System.out.println("maior de idade");
        } else {
            System.out.println("menor de idade");
        }

        int contador = 0;

        System.out.println("contador: " + contador);
        contador++;
        System.out.println("contador: " + contador);

        int compra1 = 1500;
        int compra2 = 1600;
        System.out.println("primeira compra1: " + compra1);
        System.out.println("segunda compra2: " + compra2);

        int totalCompras = compra1 + compra2;
        System.out.println("total de Compras: " + totalCompras);

        int pontos = 0;
        System.out.println("pontos: " + pontos);
        pontos += 10;
        System.out.println("pontos: " + pontos);
        pontos += 20;
        System.out.println("pontos: " + pontos);

        int estoque = 1000;
        int vendidos = 652;
        int restante = estoque - vendidos;
        System.out.println("estoque atual: " + restante);
//        int teste = 2147483647;


        // testes com long

        long populacao = 8000000000L;
        System.out.println("populacao: " + populacao);

        long acessos = 15000000000L; // te que colocar o L ao final
        System.out.println("acessos: " + acessos);

        long numero1 = 15;
        long numero2 = 30;
        long numero3 = numero1 + numero2;

        System.out.println("numero1: " + numero1);
        System.out.println("numero2: " + numero2);
        System.out.println("numero3: " + numero3);

    }
}
