import java.util.Scanner;

public class exerc3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        int num1 = numero;
        num1 += 1;

        int num2 = numero;
        num2++;

        int num3 = numero;
        num3 = num3 + 1;

        System.out.println("Com += : " + num1);
        System.out.println("Com ++ : " + num2);
        System.out.println("Com soma direta: " + num3);

        sc.close();
    }
}
