package ex05;

import java.util.Scanner;

public class ex05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.printf("A média entre %.1f e %.1f é igual a %.1f%n", nota1, nota2, media);

        scanner.close();
    }
}
