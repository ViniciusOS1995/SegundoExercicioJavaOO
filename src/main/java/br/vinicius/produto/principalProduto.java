package br.vinicius.produto;

public class principalProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Microfone USB", 210.99);
        double produtoSemfrete = produto1.desconto(17);
        System.out.println("O " +produto1.getNome()+ " ficou com " + produtoSemfrete + " de desconto\n");

        double produtoComfrete = produto1.calcularPrecoFinal();
        System.out.println("Com o Frete fica: " +produtoComfrete);

    }
}
