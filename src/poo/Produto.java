package poo;

public class Produto {
    private String nome;
    private double preco;

    //uso de encapsulamento



    void mostrarNome(){
        System.out.println("Nome " + nome);
    }

    void mostrarPreco(){
        System.out.println("mostrar Preco " + preco);
    }

    void setNome(String nome){
        this.nome = nome;
    }

    void setPreco(double preco){
        if (preco > 0) {
            this.preco = preco;
        }
    }

    String getNome(){
        return this.nome;
    }
    double getPreco(){
        return this.preco;
    }

}
