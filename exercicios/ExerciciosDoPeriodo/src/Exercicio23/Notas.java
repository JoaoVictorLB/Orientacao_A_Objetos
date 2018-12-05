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
public class Notas {
    
    float nota1, nota2, nota3, media;
    
    public Notas(float n1, float n2, float n3)
    {
        this.nota1 = n1;
        this.nota2 = n2;
        this.nota3 = n3;
    }
    
    public Notas()
    {
        
    }
    
    public void call_media()
    {
        System.out.println("Media Final: " + (nota1 + nota2 + nota3)/(float)3);
    }
    
}
