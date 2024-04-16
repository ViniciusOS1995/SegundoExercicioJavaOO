package br.vinicius.aluno;

public class Aluno {
    public Aluno(String nome) {
        this.nome = nome;
    }

    private String nome;
    private double somaNota;
    private int totalNota;

    public void avalia(double nota){
        somaNota += nota;
        totalNota++;
    }

    public double mediaNota(){
        return somaNota / totalNota;
    }

}
