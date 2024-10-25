import java.util.Scanner;

public class DetalhaIdade{
    public static void main (String [] args){
        int idadeAnos = 0, idadeMeses = 0, idadeDias = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a sua idade:0");
        idadeAnos = entrada.nextInt();

        idadeMeses =idadeAnos * 12;
        idadeDias = idadeAnos * 365;

        System.out.println("Sua idade em meses é igual a: " + idadeMeses + " meses.");
        System.out.println("Sua idade em dias é igual a: " + idadeDias + " dias.");
        }
}