package br.vinicius.livraria;

import br.vinicius.calculo.Calculavel;

public class Livro implements Calculavel {
    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    private String titulo;
    private String autor;
    private double preco;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    public void exibeInfo(){
        System.out.println("Informaçoes");
        System.out.println("Livro: "+ titulo);
        System.out.println("Autor: "+ autor );
        System.out.println("Valor: "+preco);
    }

    @Override
    public double calcularPrecoFinal() {
        double valorMaisfrete = preco + 22.77;
        double codigoCupom = (10.0/100.0)*valorMaisfrete;
        double valorFinal = valorMaisfrete - codigoCupom;

        return valorFinal;
    }
}
