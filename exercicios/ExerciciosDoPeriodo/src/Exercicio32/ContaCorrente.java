/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio32;

/**
 *
 * @author João Victor
 */
public class ContaCorrente {

    float limite;
    float saldo;
    float valorLimite;
    
    public ContaCorrente(){
        limite = 0;
        saldo = 0;
    }

    public void sacar(float valor) {
        if ((valor < 0) || (valor > saldo + limite)) {
            throw new IllegalArgumentException("Valor invalido ou slado insuficiente");
        } else {
            this.saldo -= valor;
            System.out.println("Valor sacado com sucesso!");
        }
    }

    public void depositar(float valor) {
        if ((valor < 0) || (this.saldo + this.limite < valor)) {
            throw new IllegalArgumentException("Valor invalido");
        } else {
            this.saldo += valor;
            System.out.println("Valor depositado!");
        }
    }
    
    public void setValorLimite(float valor){
        if(valor < 0)
            throw new IllegalArgumentException("Valor invalido");
        else
            this.valorLimite = valor;
    }

}
