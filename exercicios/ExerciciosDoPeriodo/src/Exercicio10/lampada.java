/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio10;

/**
 *
 * @author João Victor
 */
public class lampada {
    
    //Se estiver ligada estado receberá valor "true".
    public String estado;
    public String acesa = "Acesa";
    public String apagada = "Apagada";
    public String meiaLuz = "Meia-Luz";
    
    public boolean estaLigada()
    {
        if(estado == acesa)
            return true;
        else
            return false;
    }
    
    public void ligar()
    {
        this.estado = acesa;
    }
    
    public void desligar()
    {
        this.estado = apagada;
    }
    
    public void meiaLuz()
    {
        this.estado = "Meia-Luz";
    }
    
}
