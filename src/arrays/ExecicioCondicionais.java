package arrays;

public class ExecicioCondicionais {
    static void main() {
        String usuario = "admin";
        String senha = "1234";
        int nivelAcesso = 4;

        String descricaoAcesso = "";

        if (usuario == "admin" && senha == "1234") {
                System.out.println("Login realizado com sucesso!");
            if (nivelAcesso == 1) {
                descricaoAcesso = "Básico";
            } else if (nivelAcesso == 2) {
                descricaoAcesso = "Intermediario";
            } else if (nivelAcesso == 3) {
                descricaoAcesso = "Acesso Total";
            } else {
                descricaoAcesso = "Inválido";
            }
                System.out.println("Nivel de Acesso: " + descricaoAcesso);

        } else {
            System.out.println("Usuário ou senha inválidos");
        }
    }
}
