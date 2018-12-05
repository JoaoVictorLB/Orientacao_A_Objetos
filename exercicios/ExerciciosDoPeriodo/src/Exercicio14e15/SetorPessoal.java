/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio14e15;

/**
 *
 * @author João Victor
 */
public class SetorPessoal {

    Funcionario[] vetFunc;
    int indice = 0;
    int capacidade;

    public SetorPessoal(int i) {
        vetFunc = new Funcionario[i];
        this.capacidade = i;
    }

    public void addFunc(int mat, String nom, int dep, float sal, String funcao) {
        Funcionario f = new Funcionario(mat, nom, dep, sal, funcao);
        vetFunc[indice] = f;
        indice++;
    }

    public void folhaDePagamento() {
        System.out.println("FOLHA DE PAGAMENTOS:");
        for (int i = 0; i < capacidade; i++) {
            System.out.println("Nome: " + vetFunc[i].nome + " / Salario: " + vetFunc[i].salario);
        }
    }

    public float somaFolhaDePagamento() {
        float somatorio = 0;
        for (int i = 0; i < capacidade; i++) {
            somatorio += vetFunc[i].salario;
        }
        return somatorio;
    }

    public String maiorSalario() {
        String maior = vetFunc[0].nome;
        float aux = vetFunc[0].salario;

        for (int i = 0; i < capacidade; i++) {
            if (vetFunc[i].salario > aux) {
                maior = vetFunc[i].nome;
            }
        }

        return maior;
    }

    public void departamento(int numDep) {
        for (int i = 0; i < capacidade; i++) {
            if (vetFunc[i].departamento == numDep) {
                System.out.println("Nome: " + vetFunc[i].nome + "/ Funcao: " + vetFunc[i].funcao);
            }
        }
    }

    public void funcao(String f) {
        for (int i = 0; i < capacidade; i++) {
            if (vetFunc[i].funcao == f) {
                System.out.println("Nome: " + vetFunc[i].nome);
            }
        }
    }

    public void salarioOrdenado()
    {
        Funcionario[] ordenado = new Funcionario[capacidade];
        for(int i = 0; i < capacidade - 1; i++)
        {
            if(vetFunc[i].salario > vetFunc[i+1].salario)
            {
                ordenado[i] = vetFunc[i+1];
                ordenado[i+1] = vetFunc[i];
            }
        }
        
        System.out.println("Salarios em Ordem Crescente: ");
        for(int j = 0; j < capacidade; j++)
        {
            System.out.println("Nome: " + ordenado[j].nome + "/ Salario: " + ordenado[j].salario);
        }
    }
}
