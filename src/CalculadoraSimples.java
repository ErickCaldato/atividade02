import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o segundo numero: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Insira o segundo numero: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Escolha a operação (+, -. *. /): ");
        char operacao = scanner.next(),charAt(0);
        double resultado;

        switch (operacao) {
            resultado = numero1 + numero2;

            System.out.println("Resultado: " + resultado);
            break;
            case '-'

        }
    }
}
