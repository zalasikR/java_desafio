package Primeiros_Exercicios;

import java.util.Scanner;

public class exerc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();
        System.out.print("Digite o terceiro número: ");
        int n3 = sc.nextInt();

        int soma = n1 + n2 + n3;
        System.out.println("A soma dos números é: " + soma);

        sc.close();
    }
}
