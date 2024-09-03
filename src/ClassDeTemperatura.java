import java.util.Scanner;

public class ClassDeTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a temperatura em graus Celsuis: ");
        double temperatura = scanner.nextDouble();

        if (temperatura > 30) {
            System.out.println("A temperatura está quente.");
        }
        else if (temperatura >= 15 && temperatura <= 30) {
            System.out.println("A temperatura está agradevel.");
        }else {
            System.out.println("A temperatura está frio.");
        }
        scanner.close();
    }
}
