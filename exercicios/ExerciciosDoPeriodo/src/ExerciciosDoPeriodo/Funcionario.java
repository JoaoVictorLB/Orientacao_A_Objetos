/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciciosDoPeriodo;

/**
 *
 * @author João Victor
 */
//Exercicio 20
public class Funcionario {

    private static int numeroFuncionarios = 0;
    
    private int matricula;
    private String nome;
    private int idade;
    private String cargo;
    private float salario;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Funcionario() {
        this.salario = (float) 1500.0;
        numeroFuncionarios++;
    }

    public Funcionario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        numeroFuncionarios++;
    }

    public Funcionario(int mat, String nome, float sal) {
        this.matricula = mat;
        this.nome = nome;
        this.salario = sal;
        numeroFuncionarios++;
    }
}
