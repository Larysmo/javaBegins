/* 
Criar um programa que calcule a média de salários de uma 
empresa, pedindo ao usuário a grade de funcionários e os 
salários, e devolvendo a média salarial.
*/

import java.util.Scanner;

public class ExercicioTres{
    public static void main(String [] args){
        String nome;
        double salario = 0, mediaSalario = 0, totalSalario = 0, contador = 0; 

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("Informe o nome: ");
            nome = entrada.next();
            System.out.println("Informe salario");
            salario = entrada.nextDouble();
            totalSalario = totalSalario + salario;
            contador++;
        }

        mediaSalario = totalSalario / contador;

        System.out.println("A media dos salários é: " + mediaSalario);

        entrada.close();
        
    }
}