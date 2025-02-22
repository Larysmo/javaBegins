import java.util.Scanner;
import java.util.Arrays;

public class OrdemCrescente{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        int Quantidade = 3;
        int[] Numeros = new int[Quantidade];
        

        System.out.println("Ordenador de numeros\n\n");

        for (int x = 0; x < Quantidade; x++){
            System.out.println("Digite o " + (x+1) + " numero");
            Numeros[x] = entrada.nextInt();
        }

        Arrays.sort(Numeros);
        System.out.println("\n\nOs numeros em ordem crescente são: ");
        for (int Numero : Numeros) {
            System.out.println(Numero);
        }
    }
}

