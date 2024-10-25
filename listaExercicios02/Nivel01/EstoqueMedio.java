/*
Faça um programa para calcular o estoque médio de uma peça, sendo que:
ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.
*/

import java.util.Scanner;

public class EstoqueMedio{
    public static void main(String [] args){
        double estoqueMedio = 0, qtdMinima = 2, qtdMaxima = 15;

        estoqueMedio = (qtdMinima + qtdMaxima)/2;

        System.out.println("O estoque médio é igual a: " + estoqueMedio);
        
    }
}