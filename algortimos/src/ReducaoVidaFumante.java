import java.util.Scanner;
public class ReducaoVidaFumante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de cigarros fumados por dia: ");
        int cigarrosPorDia = scanner.nextInt();

        System.out.print("Digite quantos anos você já fumou: ");
        int anosFumando = scanner.nextInt();

        int minutosPerdidosPorCigarro = 10;

        int totalCigarros = cigarrosPorDia * anosFumando * 365;

        int totalMinutosPerdidos = totalCigarros * minutosPerdidosPorCigarro;

        int diasPerdidos = totalMinutosPerdidos / 1440;

        System.out.println("Você perderá aproximadamente " + diasPerdidos + " dias de vida.");

        scanner.close();
    }

}
