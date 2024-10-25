import java.util.Scanner;

public class ConverteTemperatura{
    public static void main(String [] args){
        float celsius = 0, fahrenheit = 0, temperatura = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Favor informar a temperatura:");
        
        temperatura = entrada.nextFloat();

        celsius = (temperatura - 32) * 5/9;
        fahrenheit = (9*temperatura + 160)/5;

        System.out.println("O valor em celsius é " + celsius + "°C.\nO valor em Fahrenheit é igua a " + fahrenheit + "F.");
    }
}