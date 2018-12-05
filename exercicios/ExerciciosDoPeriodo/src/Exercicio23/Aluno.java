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
public class Aluno extends Pessoa {
    
    int matricula;
    Notas notaAluno = new Notas();
    
    public Aluno(String n, String t, String e, String c, int id, int i, int m, float n1, float n2, float n3)
    {
        super(n, t, e, c, id, i);
        this.matricula = m;
        this.notaAluno.nota1 = n1;
        this.notaAluno.nota2 = n2;
        this.notaAluno.nota3 = n3;
    }
    
}
