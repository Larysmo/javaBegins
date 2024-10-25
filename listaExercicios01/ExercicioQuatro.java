/* 
Uma parede em formato retangular, cuja altura é hp (altura da parede) 
e a largura lp (largura da parede) precisa ser coberta por 
azulejos também retangulares. O azulejo retangular tem dimensões 
ha (altura do azulejo) e la (largura do azulejo). 
Escreva um programa que leia as quatro medidas 
hp, lp, ha e la, calcule e imprima quanto azulejos com as 
medidas dadas são necessários para cobrir a parede dada.
*/



import java.util.Scanner;

public class ExercicioQuatro{
    public static void main (String [] args){
        double hp = 0, lp = 0, ha = 0, la = 0, qtd = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a altura da parede: ");
        hp = entrada.nextDouble();

        System.out.println("informe a largura da parede: ");
        lp = entrada.nextDouble();
        
        System.out.println("informe a largura do azulejo: ");
        la = entrada.nextDouble();

        System.out.println("informe a altura do azulejo: ");
        ha = entrada.nextDouble();

        qtd = (hp*lp)/(ha*la);

        System.out.println("vc precisará de " + qtd + " azulejos para preencher toda a parede.");


    }
}