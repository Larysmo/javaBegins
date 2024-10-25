import java.util.Scanner;

public class ConverteMoeda{
    public static void main(String [] args){
        double cotacaoDolar = 5.67, valorDolar = 0, valorReal = 0;
        Scanner entrada = new Scanner(System.in);



        System.out.println("Informe o valor em dolar: ");
        valorDolar = entrada.nextDouble();

        valorReal = valorDolar * cotacaoDolar;

        System.out.println("O valor em Real brasileiro é: R$" + valorReal);

        entrada.close();
        


    }
}