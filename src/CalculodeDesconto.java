import java.util.Scanner;

public class CalculodeDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("insira o valor total da compra: R$");
        double valorCompra = scanner.nextDouble();

        double desconto = 0;
        int percentualDesconto = 0;

        if (valorCompra > 500) {
            percentualDesconto = 20;
        }
        else if (valorCompra >= 200 && valorCompra <= 500) {
            percentualDesconto = 10;
        }
        else if (valorCompra >= 100 && valorCompra < 200) {
            percentualDesconto = 5;
        }

        desconto = (percentualDesconto / 100.0) * valorCompra;
        double valorFinal = valorCompra - desconto;

        System.out.printf("Valor original da compra: R$ &.2f%n", valorCompra);
        System.out.printf("Percentual de desconto aplicado: %d%%n", percentualDesconto);
        System.out.printf("Valor do desconto: R$ %.2f%n", desconto);
        System.out.printf("Valor final apos o desconto: R$ %.2f%n", valorFinal);

        scanner.close();

    }
}
