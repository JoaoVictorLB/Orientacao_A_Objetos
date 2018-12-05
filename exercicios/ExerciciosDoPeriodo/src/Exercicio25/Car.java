/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio25;

/**
 *
 * @author João Victor
 */
public class Car implements CarbonFootPrint{
    
    String combustivel;
    public float cilindrada;
    public float litros;
    
    @Override
    public float getCarbonFootPrint()
    {
        float x;
        x = cilindrada*litros;
        return x;
    }
    
}
