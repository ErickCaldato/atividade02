import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                System.out.print("Digite um numero de 1 a 7 para representar um dia da semana: ");
                int dia = scanner.nextInt();

        switch (dia) {
            case 1:

    System.out.println("Domingo");
        break;
            case 2:

        System.out.println("Segunda");
        break;
        case 3:

            System.out.println("Terça");
        break;
            case 4:

                System.out.println("Quarta");
                break;
            case 5:

                System.out.println("Quinta");
                break;
            case 6:

                System.out.println("Sexta");
                break;
            case 7:

                System.out.println("Sabado");
                break;
            default:

                System.out.println("Numero invalido. Digite um numero entre 1 e 7.");
                                break;
        }

        scanner.close();
    }
}
