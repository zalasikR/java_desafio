import java.util.Scanner;

public class exerc5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double A = sc.nextDouble();
        System.out.print("Digite o valor de B: ");
        double B = sc.nextDouble();
        System.out.print("Digite o valor de C: ");
        double C = sc.nextDouble();

        double X = 4*A + 5*B - 3*C + (A*B) + (A*C) - (B*C)/2;

        System.out.println("O valor de X é: " + X);

        sc.close();
    }
}
