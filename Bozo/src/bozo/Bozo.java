/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bozo;
import java.util.Scanner;

/**
 *
 * @author João Victor
 */
public class Bozo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Bem-Vindos ao Jogo do Bozo!");
        System.out.println();
        
        //Leitura dos nomes
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nome do jogador 1: ");
        String nome1  = scanner.next();        
        Jogadores j1 = new Jogadores(nome1);
        
        System.out.println("Nome do jogador 2: ");
        String nome2 = scanner.next();
        Jogadores j2 = new Jogadores(nome2);
        
        Tabuleiro tab = new Tabuleiro(j1, j2);
        tab.jogar();
        
    }
    
}
