import java.util.Scanner;

public class Main {

    private static double CalculaAreaQuadrado(double lado){
        return lado * lado;
    }

    public static void main(String[] arg){

        Scanner scaneer = new Scanner(System.in);

        System.out.println("Vamos calcular a aréa de um quadrado ?");
        System.out.println("Digite o valor do lado do quadrado: ");

        double lado = scaneer.nextDouble();

        System.out.println("A area do quadrado é : " + CalculaAreaQuadrado(lado));



    }
}
