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
public abstract class Professor extends Pessoa {
    
    float salario;
    int horas;
    
    public Professor(String n, String t, String e, String c, int id, int i, int h)
    {
        super(n, t, e, c, id, i);
        this.horas = h;
    }
    
    abstract void calculo_salario();
    
    public float mostra_salario()
    {
        return salario;
    }
}
