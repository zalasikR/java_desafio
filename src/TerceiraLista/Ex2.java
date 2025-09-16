package TerceiraLista;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de N: ");
        int n = sc.nextInt();

        int a = 0, b = 1, i = 1;

        while (i <= n) {
            System.out.print(a + " ");
            int prox = a + b;
            a = b;
            b = prox;
            i++;
        }
        sc.close();
    }
}
