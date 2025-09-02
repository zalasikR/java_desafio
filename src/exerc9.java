import java.util.Scanner;

public class exerc9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço do produto: ");
        double preco = sc.nextDouble();

        if (preco > 50) {
            preco -= preco * 0.15;
        }

        System.out.println("Valor final do produto: " + preco);

        sc.close();
    }
}
