package exercicio10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a massa do objeto (kg): ");
        double massa = sc.nextDouble();

        System.out.print("Informe a velocidade do objeto (m/s): ");
        double velocidade = sc.nextDouble();

        ObjetoFisico obj = new ObjetoFisico(massa, velocidade);

        double ec = obj.calcularEnergiaCinetica();
        double h = obj.calcularAlturaEquivalente();

        System.out.printf("Energia cinética: %.2f J%n", ec);
        System.out.printf("Altura equivalente: %.2f m%n", h);

        sc.close();
    }
}
