import java.awt.geom.Area;
import java.util.Scanner;

public class Main {

    /*
     * Escreva um código que receba a base e a alturade um retângulo, calcule sua área e exiba na tela

       fórmula: área=base X altura
     * */

    private static double calcularArea(double base, double altura){
        return  base * altura;
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos calcular a área de um retangulo?");
        System.out.println("Digite a base do retangulo: ");
        double base = scanner.nextDouble();
        System.out.println("Digite a altura do retangulo: ");
        double altura = scanner.nextDouble();

        double area = calcularArea(base, altura);
        System.out.println("A àrea do retangulo é: " + area);




    }
}
