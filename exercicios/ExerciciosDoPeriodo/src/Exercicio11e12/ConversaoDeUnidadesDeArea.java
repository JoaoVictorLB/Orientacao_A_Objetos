/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio11e12;

/**
 *
 * @author João Victor
 */
public class ConversaoDeUnidadesDeArea {
    
    public static float metroQuadPeQuad(float metro)
    {
        float x;
        x = metro * (float)10.76;
        return x;
    }
    
    public static float peQuadCentQuad(float pe)
    {
        float y;
        y = pe * (float)929;
        return y;
    }
    
    public static float miQuadAcres(float milha)
    {
        float z;
        z = milha * (float)640;
        return z;
    }
    
    public static float acrePeQuad(float acre)
    {
        float w;
        w = acre * (float)43560;
        return w;
    }
    
    public static float peQuadAcre(float pe)
    {
        float k;
        k = pe/(float)43560;
        return k;
    }
    
}
