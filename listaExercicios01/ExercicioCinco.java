/* 
 Calcular e apresentar o valor do volume de uma lata de óleo,
 utilizando fórmula: V = 3.14159 * R * R * A, em que as variáveis: V, R e 
 A representam respectivamente o volume, o raio e a altura.
*/


public class ExercicioCinco{
    public static void main(String [] args){
        double volume = 0, raio = 15, altura = 65;

        volume = 3.14159 * raio * raio * altura;

        System.out.println("O volume da lata de óléo é de " + volume + " m3");

    }
}