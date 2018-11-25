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
public class Dados {
    
    private int valor;
    
    int jogarDado(){
        
        valor = 1 + (int)(Math.random()*6);
        return valor;
    }
    
}
