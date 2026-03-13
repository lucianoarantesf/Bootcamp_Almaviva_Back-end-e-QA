import jdk.dynalink.StandardNamespace;

import java.util.Scanner;

public class Main {

    /* 4. Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas */

    private static int DifIdade(int idade1, int idade2){
        return idade1 - idade2;
    }

    public static void main(String[] args) {
        Scanner scannerp1 = new Scanner(System.in);
        Scanner scannerp2 = new Scanner(System.in);

        System.out.print("Digite o nome da primeira pessoa: ");
        String nomep1 = scannerp1.nextLine();

        System.out.print("Digite a idade da primeira pessoa: ");
        int idadep1 = scannerp1.nextInt();

        System.out.print("Digite o nome da segunda pessoa: ");
        String nomep2 = scannerp2.nextLine();

       System.out.print("Digite a idade da segunda pessoa:");
        int idadep2 = scannerp2.nextInt();

        int diferenca = DifIdade(idadep1, idadep2);
        System.out.println("A diferença de idade entre " + nomep1 + " e " + nomep2 + " é de " + diferenca + " anos.");
    }
}
