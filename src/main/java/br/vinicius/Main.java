package br.vinicius;

import br.vinicius.Persona.Pessoa;
import br.vinicius.aluno.Aluno;
import br.vinicius.banco.ContaBancaria;
import br.vinicius.livraria.Livro;


public class Main {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria(115599, 1259.56, "Caio Xavier");
        System.out.println("Informações da conta:");
        System.out.println("Nome do Titular: " + conta1.getNomeTitular());
        System.out.println("Numero da conta: "+ conta1.getNumeroConta());
        System.out.println("Saldo da conta: "+ conta1.getSaldo());
        conta1.setSaldo(1859.56);
        System.out.println("Novo Saldo: " + conta1.getSaldo());

        Pessoa pessoa1 = new Pessoa("Caio Xavier", 2022);
        pessoa1.verificaIdade();

        Aluno aluno1 = new Aluno("Caio Xavier");
        aluno1.avalia(7.5);
        aluno1.avalia(8.0);
        aluno1.avalia(6.5);
        aluno1.avalia(9.5);
        System.out.println("Media das Notas: " + aluno1.mediaNota());
    }
}