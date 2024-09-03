import java.util.Scanner;

public class VerificacaoLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";

        System.out.print("Digite o nome de usuario: ");
        String usuario = scanner.next();

        System.out.print("Digite a senha:" );
        String senha = scanner.next();

        if (usuario.equals (usuarioCorreto) && senha.equals(senhaCorreta)) {
            System.out.println("login bem-sucedido!");
        }
        else {
            System.out.println("Nome de usuario ou senha incorretos.");
        }
        scanner.close();
    }
}
