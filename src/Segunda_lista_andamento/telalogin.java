import java.util.Scanner;

public class telalogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";

        System.out.print("Digite o usuário: ");
        String usuario = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
            System.out.println("Acesso permitido");
        } else if (!usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
            System.out.println("Usuário inválido");
        } else if (usuario.equals(usuarioCorreto) && !senha.equals(senhaCorreta)) {
            System.out.println("Senha incorreta");
        } else {
            System.out.println("Usuário e senha incorretos");
        }

        scanner.close();
    }
}
