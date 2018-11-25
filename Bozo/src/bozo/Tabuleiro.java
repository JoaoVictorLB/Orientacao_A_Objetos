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
public class Tabuleiro {

    private Jogadores jj1;
    private Jogadores jj2;
    private int rodadas = 6;

    Tabuleiro(Jogadores jj1, Jogadores jj2) {

        this.jj1 = jj1;
        this.jj2 = jj2;
    }

    void jogar() {

        int sorte1j1, sorte2j1, sorte3j1;
        int sorte1j2, sorte2j2, sorte3j2;

        int somatorio1 = 0;
        int somatorio2 = 0;

        for (int i = 1; i < rodadas; i++) {
            
            System.out.println();
            System.out.println("Vez de " + jj1.getNome() + " jogar!");
            sorte1j1 = jj1.d1.jogarDado();
            sorte2j1 = jj1.d2.jogarDado();
            sorte3j1 = jj1.d3.jogarDado();
            System.out.println("Numeros sorteados na rodada por " + jj1.getNome() + ": " + sorte1j1 + ", " + sorte2j1 + " e " + sorte3j1);
            System.out.println();
            
            somatorio1 = somatorio1 + sorte1j1 + sorte2j1 + sorte3j1;

            System.out.println("Pontuacao da rodada " + i + " de " + jj1.getNome() + " foi de: \n" + somatorio1);

            System.out.println();
            System.out.println("Vez de " + jj2.getNome() + " jogar!");
            sorte1j2 = jj2.d1.jogarDado();
            sorte2j2 = jj2.d2.jogarDado();
            sorte3j2 = jj2.d3.jogarDado();
            System.out.println("Numeros sorteados na rodada por " + jj2.getNome() + ": " + sorte1j2 + ", " + sorte2j2 + " e " + sorte3j2);
            System.out.println();
            
            somatorio2 = somatorio2 + sorte1j2 + sorte2j2 + sorte3j2;

            System.out.println("Pontuacao da rodada " + i + " de " + jj2.getNome() + " foi de: \n" + somatorio2);
            System.out.println();
            
        }

        if (somatorio1 > somatorio2) {
            System.out.println(jj1.getNome() + " venceu!");
        } else if (somatorio1 < somatorio2) {
            System.out.println(jj2.getNome() + " venceu!");
        } else {
            System.out.println(" empate!");
        }

    }

}
