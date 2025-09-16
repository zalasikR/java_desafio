package TerceiraLista;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int limite = sc.nextInt();
        int i = 2;

        while (i <= limite) {
            System.out.print(i + " ");
            i += 2;
        }
        sc.close();
    }
}
