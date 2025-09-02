package Primeiros_Exercicios;

import java.util.Scanner;

public class exerc6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int CONSTANTE = 10;

        System.out.print("Tente adivinhar o número da constante: ");
        int chute = sc.nextInt();

        if (chute == CONSTANTE) {
            System.out.println("Parabéns, você acertou!");
        } else {
            System.out.println("Errou! O valor era: " + CONSTANTE);
        }

        sc.close();
    }
}
