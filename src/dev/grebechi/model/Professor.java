package dev.grebechi.model;

public class Professor extends Funcionario {

    public Professor(String nome, String sobrenome, int matricula, double salario) {
        super(nome, sobrenome, matricula, salario);
    }

    public Professor(String nome, String sobrenome, Endereco endereco, int matricula, double salario) {
        super(nome, sobrenome, endereco, matricula, salario);
    }

    @Override
    public double getSalarioPrimeiraParcela() {
        return super.getSalario();
    }

    @Override
    public double getSalarioSegundaParcela() {
        return 0;
    }
    
    
}
