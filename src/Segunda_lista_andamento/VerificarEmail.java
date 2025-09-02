package segunda_lista_exercicios_em_andamento;
import java.util.Scanner;

public class VerificarEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um e-mail válido: ");
        String email = scanner.nextLine();

        if (email.contains("@") && email.endsWith(".com")) {
            System.out.println("E-mail válido.");
        } else {System.out.println("E-mail invalido, tente novamente: .");}
        scanner.close();
    }
    }