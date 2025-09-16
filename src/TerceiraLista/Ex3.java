package TerceiraLista;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";
        int tentativas = 3;

        while (tentativas > 0) {
            System.out.print("Digite o login: ");
            String usuario = sc.nextLine();
            System.out.print("Digite a senha: ");
            String senha = sc.nextLine();

            if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                System.out.println("Parabéns! Usuário logado.");
                break;
            } else if (usuario.equals(usuarioCorreto)) {
                System.out.println("Senha incorreta.");
            } else {
                System.out.println("Login ou senha incorretos.");
            }
            tentativas--;

            if (tentativas == 0) {
                System.out.println("Que pena, você esgotou suas tentativas de login. Tente novamente mais tarde.");
            }
        }
        sc.close();
    }
}
