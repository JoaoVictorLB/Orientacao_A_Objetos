/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio23;

/**
 *
 * @author João Victor
 */
public class Pessoa {
    
    String nome, telefone, endereco, cpf;
    int identidade, idade;
    
    public Pessoa(String n, String tel, String end, String cpf, int id, int i)
    {
        this.nome = n;
        this.telefone = tel;
        this.endereco = end;
        this.cpf= cpf;
        this.identidade = id;
        this.idade = i;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdentidade() {
        return identidade;
    }

    public int getIdade() {
        return idade;
    }
    
    public int getIdade(int ano_atual, int ano_futuro)
    {
        return idade + (ano_futuro - ano_atual);
    }
}
