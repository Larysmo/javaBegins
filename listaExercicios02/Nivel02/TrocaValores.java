import java.util.Scanner;

public class TrocaValores{
    public static void main(String [] args){
        int numeroUm = 0, numeroDois = 0, troca = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor do Numero Um");
        numeroUm = entrada.nextInt();
        System.out.println("Informe o valor do Numero Dois");
        numeroDois = entrada.nextInt();

        System.out.println("O numero um é igual a " + numeroUm + " e o numero dois é igual a " + numeroDois);
        troca = numeroUm;
        numeroUm = numeroDois;
        numeroDois = troca;    

        System.out.println("TROCA: O numero um é igual a " + numeroUm + " e o numero dois é igual a " + numeroDois);


    }
}