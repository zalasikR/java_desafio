package exercicio9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o preço do produto: ");
        double preco = sc.nextDouble();

        Produto p = new Produto(preco);

        System.out.printf("Preço final do produto: R$ %.2f%n", p.calcularPrecoFinal());

        sc.close();
    }
}
