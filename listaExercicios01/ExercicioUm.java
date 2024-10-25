/* 
Escreva um programa que, com base em uma temperatura em graus 
celsius, a converta e exiba em Kelvin (K), Réaumur (Re), 
Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas: 
F = C * 1.8 + 32; 
K = C + 273.15; 
Re = C * 0.8; 
Ra = C * 1.8 + 32 + 459.67
*/

public class ExercicioUm {
    public static void main (String[] args){
        double celsius = 25;
        double kelvin, fahrenheit, reaumur, rankine;
        fahrenheit = celsius + 273.15;
        kelvin  = celsius * 1.8 + 32;
        reaumur = celsius * 0.8;
        rankine = celsius * 1.8 + 32 + 459.67;

        System.out.println("O valor em Celsius é: " + celsius);
        System.out.println("O valor em Fahrenheit é: " + fahrenheit);
        System.out.println("O valor em Kelvin é: " + kelvin);
        System.out.println("O valor em Rankine é: " + rankine);
        System.out.println("O Valor em Reaumur é: " + reaumur);
    }
}