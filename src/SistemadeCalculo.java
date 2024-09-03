import java.util.Scanner;

public class SistemadeCalculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o salário bruto
        System.out.print("Insira o salário bruto do funcionário: R$ ");
        double salarioBruto = scanner.nextDouble();

        // Solicita o número de anos de trabalho
        System.out.print("Insira o número de anos que o funcionário trabalhou na empresa: ");
        int anosTrabalhados = scanner.nextInt();

        double bonus = 0;
        double percentualImposto = 0;

        // Aplica as regras de bonificação
        if (anosTrabalhados > 10) {
            bonus = 0.10 * salarioBruto;
        } else if (anosTrabalhados >= 5 && anosTrabalhados <= 10) {
            bonus = 0.05 * salarioBruto;
        }

        // Aplica as regras de imposto
        if (salarioBruto > 5000) {
            percentualImposto = 27;
        } else if (salarioBruto >= 3000 && salarioBruto <= 4999.99) {
            percentualImposto = 18;
        } else {
            percentualImposto = 10;
        }

        // Calcula o valor do imposto
        double imposto = (percentualImposto / 100) * salarioBruto;

        // Calcula o salário líquido
        double salarioLiquido = salarioBruto + bonus - imposto;

        // Exibe os resultados
        System.out.printf("Salário bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("Bônus recebido: R$ %.2f%n", bonus);
        System.out.printf("Imposto descontado: R$ %.2f (%.0f%%)%n", imposto, percentualImposto);
        System.out.printf("Salário líquido: R$ %.2f%n", salarioLiquido);

        scanner.close();
    }
}

