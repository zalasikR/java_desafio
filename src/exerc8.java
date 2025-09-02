import java.util.Scanner;

public class exerc8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário atual: ");
        double salario = sc.nextDouble();

        if (salario < 1000) {
            salario += salario * 0.10;
        } else {
            salario += salario * 0.05;
        }

        System.out.println("Novo salário: " + salario);

        sc.close();
    }
}
