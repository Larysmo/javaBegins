import java.util.Scanner;

public class PagaComissao{
    public static void main(String [] args){
        String nomeVendedor;
        int codPeca = 0;
        double qtdVendida = 0, precoUnitario = 0, valorComissao = 0, totalVendas = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        nomeVendedor = entrada.next();
        System.out.println("Informe a quantidade de produtos vendida: ");
        qtdVendida = entrada.nextDouble();
        System.out.println("informe o valor unitário da peça: ");
        precoUnitario = entrada.nextDouble();

        totalVendas = qtdVendida * precoUnitario;
        valorComissao = totalVendas * 0.05;

        System.out.println("Você vendeu um total de R$" + totalVendas + ". O valor de sua comissão é de R$ " + valorComissao);
        
    }
}