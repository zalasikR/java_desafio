package TerceiraLista;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int n = sc.nextInt();
        int fatorial = 1;

        System.out.print(n + "! = ");
        for (int i = n; i >= 1; i--) {
            fatorial *= i;
            System.out.print(i);
            if (i > 1) System.out.print(" × ");
        }
        System.out.println(" = " + fatorial);
        sc.close();
    }
}
