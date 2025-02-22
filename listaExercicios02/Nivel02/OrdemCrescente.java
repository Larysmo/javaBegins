import java.util.Scanner;
import java.util.Arrays;

public class OrdemCrescente{
    public static void main(String [] args){
        int numeros = 3;
        int[] Ordem = new int[numeros];
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        Ordem[0] = entrada.nextInt();
        System.out.println("Informe o segundo numero: ");
        Ordem[1] = entrada.nextInt();
        System.out.println("Informe o terceiro numero: ");
        Ordem[2] = entrada.nextInt();

        System.out.println("Os numeros informados foram: Numero um: " + Ordem[0] + " \nnumero dois: " + Ordem[1] + " \nnumero três: " + Ordem[2]);
        array [] ordenado = Arrays.sort(Ordem);
        System.out.println(ordenado);

        
        ;
    }
}

