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
public class ProfessorEfetivo extends Professor{
    
    int horas_pesquisa;
    
    public ProfessorEfetivo(String n, String t, String e, String c, int id, int i, int h, int hp)
    {
        super(n, t, e, c, id, i, h);
        this.horas_pesquisa = hp;
    }
    
    @Override
    public void calculo_salario()
    {
        System.out.println("Salario: " + salario*horas);
    }
    
}
