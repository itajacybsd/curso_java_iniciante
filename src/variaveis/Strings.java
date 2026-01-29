package variaveis;

public class Strings {
    static void main() {
        String nome = "Paulo";

        IO.println("nome: " + nome);

        String vazia = "";

        String espacoEmBranco = " ";
        String caracteresEspeciais = "!@#$%^&*()";

        String instancia = new String("a");
        IO.println("instancia: " + instancia);

        String nomeCompleto = "Paulo antonio ferreira mendes macedo";
        nomeCompleto = nomeCompleto.replaceAll(" ","");

        System.out.println("numero de caracteres: " + nomeCompleto.length());

        String email = "paulo@gmail.com";

        if (email.contains("@gmail.com")) {
            System.out.println("email ok");
        }
    }
}
