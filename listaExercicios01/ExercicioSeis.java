/*
Escreva um programa para determinar a quantidade 
de cavalos necessários para se levantar uma massa 
de m quilogramas a uma altura de h metros em t segundos. 
Considere cavalos = (m * h / t) / 745,6999
*/

import java.util.Scanner;

public class ExercicioSeis{
    public static void main(String [] args){
        double cavalos = 0, massa = 0, altura = 0, tempo = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o peso:");
        massa = entrada.nextDouble();

        System.out.println("Informe a altura:");
        altura = entrada.nextDouble();

        System.out.println("Informe o tempo disponivel: ");
        tempo = entrada.nextDouble();

        cavalos = (massa * altura / tempo) / 745.6999;

        System.out.println("Serão necessários " + cavalos + " cavalos. /n Ou vc pode alugar uma maquina.");

    }
}