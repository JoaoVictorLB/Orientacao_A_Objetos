/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciciosDoPeriodo;

import Exercicio10.lampada;
import Exercicio11e12.ConversaoDeUnidadesDeArea;
import Exercicio20.Data;
import Exercicio25.Bicycle;
import Exercicio25.Building;
import Exercicio25.Car;
import Exercicio25.CarbonFootPrint;
import Exercicio32.ContaCorrente;
import java.util.ArrayList;

/**
 *
 * @author João Victor
 */
public class ExerciciosDoPeriodo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Exercicio 10
        lampada l = new lampada();
        lampada ll = new lampada();
        l.ligar();
        ll.desligar();
        
        System.out.println("Estado da lampada 'l': ");
        if(l.estaLigada())
            System.out.println("Esta ligada!");
        else
            System.out.println("Esta desligada!");
        
        System.out.println("Estado da lampada 'll': ");
        if(ll.estaLigada())
            System.out.println("Esta ligada!");
        else
            System.out.println("Esta desligada!");
        System.out.println("=================================================");
        
        //----------------------------------------------------------------------
        //Exercício 11
        System.out.println("Um campo com area 8.250 metros quadrados pode ser" +
                            " representada pelas seguintes conversoes:");
        float tam = 8250;
        //Exercicio 12
        System.out.println("Pes Quadrados - " + ConversaoDeUnidadesDeArea.metroQuadPeQuad(tam));
        System.out.println("Acres - " + ConversaoDeUnidadesDeArea.peQuadAcre(tam));
        System.out.println("Centimetros Quadrados - " + ConversaoDeUnidadesDeArea.peQuadCentQuad(tam));
        System.out.println("=================================================");
        //----------------------------------------------------------------------
        //Exercício 14 e 15 estão no Pacote referente aos mesmos.
        //----------------------------------------------------------------------
        //Exercicio 20
        Data tipo1A = new Data(21, 04, 1998);
        Data tipo1B = new Data(20, 06, 1999);
        Data tipo2A = new Data("Setembro", 27, 2006);
        Data tipo2B = new Data("Novembro", 10, 1977);
        Data tipo3A = new Data(365, 2018);
        Data tipo3B = new Data(366, 2020);
        
        System.out.println(tipo1A.dia + "/" + tipo1A.mes + "/" + tipo1A.ano);
        System.out.println(tipo1B.dia + "/" + tipo1B.mes + "/" + tipo1B.ano);
        
        System.out.println(tipo2A.m + " " + tipo2A.dia + ", " + tipo2A.ano);
        System.out.println(tipo2B.m + " " + tipo2B.dia + ", " + tipo2B.ano);
        
        System.out.println(tipo3A.dia + " " + tipo3A.ano);
        System.out.println(tipo3B.dia + " " + tipo3B.ano);
        System.out.println("=================================================");
        //----------------------------------------------------------------------
        //Exercicio 22
        Funcionario func = new Funcionario();
        System.out.println("Matricula: " + func.getMatricula());
        System.out.println("Nome: " + func.getNome());
        System.out.println("Idade: " + func.getIdade());
        System.out.println("Cargo: " + func.getCargo());
        System.out.println("Salario: " + func.getSalario());
        
        Funcionario func2 = new Funcionario("Joao", 20);
        System.out.println("Matricula: " + func2.getMatricula());
        System.out.println("Nome: " + func2.getNome());
        System.out.println("Idade: " + func2.getIdade());
        System.out.println("Cargo: " + func2.getCargo());
        System.out.println("Salario: " + func2.getSalario());
        
        Funcionario func3 = new Funcionario(201665528, "Jose", (float) 795.4);
        System.out.println("Matricula: " + func3.getMatricula());
        System.out.println("Nome: " + func3.getNome());
        System.out.println("Idade: " + func3.getIdade());
        System.out.println("Cargo: " + func3.getCargo());
        System.out.println("Salario: " + func3.getSalario());
        System.out.println("=================================================");
        //----------------------------------------------------------------------
        //Exercicio 23 - Implementado no seu respectivo pacote!
        //----------------------------------------------------------------------
        //Exercicio 25
        System.out.println("Pegadas de Carbono:");
        
        Bicycle b1 = new Bicycle();
        Bicycle b2 = new Bicycle();
        
        Car c1 = new Car();
        Car c2 = new Car();
        
        Building p1 = new Building();
        Building p2 = new Building();
        
        ArrayList<CarbonFootPrint> pc = new ArrayList<>();
        
        c1.cilindrada = 5.0f;
        c1.litros = 7.0f;
        c2.cilindrada = 6.0f;
        c2.litros = 13.8f;
        p1.numero_lampadas = 2;
        p1.numero_pessoas = 6;
        p2.numero_lampadas = 5;
        p2.numero_pessoas = 2;        
        
        pc.add(b1);
        pc.add(b2);
        pc.add(c1);
        pc.add(c2);
        pc.add(p1);
        pc.add(p2);
        
        for(int i = 0; i < pc.size(); i++)
        {
            if(i == 0 || i == 1)
                System.out.println("Tipo de objeto: Bicicleta");
            else if(i == 2 || i == 3)
                System.out.println("Tipo de objeto: Carro");
            else if(i == 4 || i == 5)
                System.out.println("Tipo de objeto: Predio");
            System.out.println("Emissao de carbono do objeto " + (i+1) + ": " + pc.get(i).getCarbonFootPrint());
        }
        System.out.println("=================================================");
        //----------------------------------------------------------------------
        //Exercicio 32
        ContaCorrente cc1 = new ContaCorrente();
        try{
            cc1.depositar(100);
            cc1.sacar(3500);
            cc1.setValorLimite(200);
        }
        catch(IllegalArgumentException e){
            e.getMessage();
        }
        
        
        
    }
    
}
