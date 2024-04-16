package br.vinicius.produto;

import br.vinicius.calculo.Calculavel;

public class Produto implements Calculavel {
    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    private String nome;
    private Double preco;

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public double desconto(double desc){
        Double totalDesconto = preco -((desc/100)*preco);
        return totalDesconto;
    }

    @Override
    public double calcularPrecoFinal() {
        double taxaEntrega = 12.99;
        double precoFinal = desconto(17) + taxaEntrega;

        return precoFinal;
    }
}
