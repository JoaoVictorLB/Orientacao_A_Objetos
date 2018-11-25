/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bozo;

/**
 *
 * @author João Victor
 */
public class Jogadores {
    
    private String nome;
    Dados d1, d2, d3;
    
    Jogadores(String nome){
        this.nome = nome;
        this.d1 = new Dados();
        this.d2 = new Dados();
        this.d3 = new Dados();
    }

    
    //Métodos Especiais
    public String getNome() {
        return nome;
    }

    public Dados getD1() {
        return d1;
    }

    public Dados getD2() {
        return d2;
    }

    public Dados getD3() {
        return d3;
    }
    //Fim dos métodos especiais!
}
