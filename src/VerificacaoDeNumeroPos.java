import java.util.Scanner;

public class VerificacaoDeNumeroPos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um numero: ");
        double numero = scanner.nextDouble();
        if (numero > 0) {
            System.out.println("O numero é positivo.");
        }
        else if (numero < 0) {
            System.out.println("o numero é negativo.");
        }
        else {
            System.out.println("o numero é zero");
        }
        scanner.close();
    }
}
