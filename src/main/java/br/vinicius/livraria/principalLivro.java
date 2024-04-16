package br.vinicius.livraria;

public class principalLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Forja","Josemaria Escrivá", 37);
        livro1.exibeInfo();

        double encomenda = livro1.calcularPrecoFinal();

        System.out.println("O final preço do livro " +livro1.getTitulo()+ " é: "+ encomenda);
    }
}
