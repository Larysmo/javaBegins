import java.util.Scanner;

public class CombustivelViagem{
    public static void main(String[] args){
        int distancia = 0, tempo = 0, velocidade = 0, litros = 0, totalLitros = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a velocidade do veiculo (km/h): ");
        velocidade = entrada.nextInt();

        System.out.println("Informe o tempo gasto na viagem em horas: ");
        tempo = entrada.nextInt();

        distancia = tempo * velocidade;

        litros = distancia / 12;

        System.out.println("Você percorreu " + distancia + "km");
        System.out.println("O total gasto em combustivel durante a viagem foi de " + litros + " litros.");

    }
}