package ex09;

import java.util.Scanner;

public class ex09 {

    public static void main(String[] args) {


        final double COTACAO_DOLAR = 3.45;


        Scanner scanner = new Scanner(System.in);


        System.out.print("Quanto dinheiro você tem na carteira (em R$)? ");
        double dinheiroReais = scanner.nextDouble();


        double dinheiroDolares = dinheiroReais / COTACAO_DOLAR;


        System.out.printf("Com R$ %.2f, você pode comprar US$ %.2f.%n", dinheiroReais, dinheiroDolares);


        scanner.close();
    }
}