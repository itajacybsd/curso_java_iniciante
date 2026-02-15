package poo;

public class CriarProduto {
    static void main() {
        Produto notebook = new Produto();
//        notebook.nome = "Acer i5";
//        notebook.preco = -5000;

        notebook.setNome("Acer i5");
        notebook.setPreco(5000);

        notebook.mostrarNome();
        notebook.mostrarPreco();

        System.out.println(notebook.getNome());
        System.out.println(notebook.getPreco());
    }
}
