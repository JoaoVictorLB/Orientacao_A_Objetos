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
public class Building implements CarbonFootPrint {

    public int numero_pessoas;
    public int numero_lampadas;
    boolean e;
    boolean ac;

    public boolean energia_renovavel() {
        return e;
    }

    public boolean ar_condicionado() {
        return ac;
    }

    @Override
    public float getCarbonFootPrint() {
        float x = 0;
        if (energia_renovavel()) {
            x = 0.0f;
            return x;
        }
        if (ar_condicionado()) {
            x = 500.0f;
        }
        x += numero_pessoas * numero_lampadas;
        return x;
    }

}
