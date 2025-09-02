import java.util.Scanner;

public class exerc10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a massa (kg): ");
        double m = sc.nextDouble();
        System.out.print("Digite a velocidade (m/s): ");
        double v = sc.nextDouble();

        double Ec = (m * Math.pow(v, 2)) / 2;

        double g = 9.8;
        double h = Ec / (m * g);

        System.out.println("Energia Cinética: " + Ec + " J");
        System.out.println("Altura correspondente: " + h + " m");

        sc.close();
    }
}
