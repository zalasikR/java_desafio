package ExerciciosAndamento;

import java.util.Scanner;

public class ClassificarPalavra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        if (palavra.isEmpty()) {
            System.out.println("Entrada inválida");
        } else {
            char primeiraLetra = palavra.toLowerCase().charAt(0);

            if (!Character.isLetter(primeiraLetra)) {
                System.out.println("Entrada inválida");
            } else if ("aeiou".indexOf(primeiraLetra) != -1) {
                System.out.println("A palavra começa com vogal");
            } else {
                System.out.println("A palavra começa com consoante");
            }
        }

        scanner.close();
    }
}
