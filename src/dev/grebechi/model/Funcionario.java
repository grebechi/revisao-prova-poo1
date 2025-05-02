package dev.grebechi.model;


public class Funcionario extends Pessoa{
    
    private int matricula;
    private double salario;

    public Funcionario(String nome, String sobrenome, int matricula, double salario) {
        super(nome, sobrenome);
        this.setMatricula(matricula);
        this.setSalario(salario);
    }

    public Funcionario(String nome, String sobrenome, Endereco endereco, int matricula, double salario) {
        this(nome, sobrenome, matricula, salario);
        this.setEndereco(endereco);
    }

    public int getMatricula() {
        return matricula;
    }

    private void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    

    public double getSalario() {
        return salario;
    }

    private void setSalario(double salario) {
        if(salario < 0){
            throw new IllegalArgumentException("O Salário não pode ser negativo.");
        }
        this.salario = salario;
        
    }
    
    
}
