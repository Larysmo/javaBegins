import java.util.Scanner;
import java.util.Arrays;

public class PropriedadeDistributiva{
    public static void main(String [] args){
        int A = 0, B = 0, C = 0, D = 0, soma = 0, multiplica = 0;
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor de A");
        A = entrada.nextInt();
        System.out.println("Informe o valor de B");
        B = entrada.nextInt();
        System.out.println("Informe o valor de C");
        C = entrada.nextInt();
        System.out.println("Informe o valor de D");
        D = entrada.nextInt();

        int numeros[] = {A,B,C,D};
        
        System.out.println("os numeros digitados foram " + (Arrays.toString(numeros)));

        
        for ( int i=0; i < 4; i++) {
            for ( int j=0; j < 4; j++) {
                if ( j > i){
                soma = numeros[i] + numeros[j];
                multiplica = numeros[i] * numeros[j];
                System.out.println("O valor de " + numeros[i] + " x "  + numeros[j] + " é igual a: " + multiplica);
                System.out.println("O valor de " + numeros[i] + " + "  + numeros[j] + " é igual a: " + soma);
                }
            }
        }
        entrada.close();       
    }

}