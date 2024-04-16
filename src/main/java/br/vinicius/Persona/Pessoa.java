package br.vinicius.Persona;

import java.util.Calendar;

public class Pessoa {

    public Pessoa(String nome, int anoNascimento) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }

    private String nome;
    private int anoNascimento;

    public void verificaIdade(){
        Calendar calendar = Calendar.getInstance();
        int idade = calendar.get(Calendar.YEAR) - anoNascimento;
        if (idade < 18){
            System.out.println("A pessoa "+nome+" não é maior de idade, ela tem "+ idade+" anos");
        }else {
            System.out.println("A pessoa "+nome+" é maior de idade, ela tem "+ idade+" anos");
        }
    }
}
