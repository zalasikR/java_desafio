package ExerciciosAndamento;

import java.util.Scanner;

public class Verificaremail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um e-mail: ");
        String email = scanner.nextLine().trim();

        if (email.contains("@") && email.endsWith(".com")) {
            System.out.println("✅ E-mail válido.");
        } else {
            System.out.println("❌ E-mail inválido.");
        }

        scanner.close();
    }
}
