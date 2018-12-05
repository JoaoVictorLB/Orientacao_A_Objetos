/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio20;

/**
 *
 * @author João Victor
 */
public class Data {
    
    public int dia, mes, ano;
    public String m;
    
    public Data(int dia, int mes, int ano)
    {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public Data(String m, int dia, int ano)
    {
        this.m = m;
        this.dia = dia;
        this.ano = ano;
    }
    
    public Data(int diasDoAno, int ano)
    {
        this.dia = diasDoAno;
        this.ano = ano;
    }
            
    
}
