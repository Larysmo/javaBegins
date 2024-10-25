/* 
2. Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino)
de 10 pessoas. Fazer um algoritmo que calcule e escreva:
a. a maior e a menor altura do grupo;
b. média de altura dos homens;
c. o número de mulheres.
*/

import java.util.Scanner;

public class ExercicioDois {
    public static void main (String [] args){
        int sexo, qtMulheres = 0, qtHomens = 0;
        float altura = 0, somaH = 0, mediaHomens = 0, maior = 0, menor = 10;
        Scanner entrada = new Scanner(System.in);

        for (int i=0; i < 10; i++){
            System.out.println("Escolha o sexo: 1-Mulher, 2-Homem");
            sexo = entrada.nextInt();
            System.out.println("Digite sua altura: ");
            altura = entrada.nextFloat();
            if (sexo==1){
                qtMulheres++;
            } else if (sexo == 2) {
                qtHomens++;
                somaH = somaH + altura;
            }else{
                System.out.println("Opção sexo inválida!");
            }

            if (altura > maior) {
                maior = altura;
            }else if (altura < menor){
                menor = altura;
            }
        }

        mediaHomens = somaH / qtHomens;

        System.out.println("A maior altura do grupo é de: " + maior);
        System.out.println("A média de altura dos homens é de: " + menor);
        System.out.println("O número de mulheres é de: " + qtMulheres);

        entrada.close();
    }
}