import java.util.Scanner;

public class menupizza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== MENU PIZZARIA =====");
        System.out.println("1 – Pizza de Calabresa (R$ 40,00)");
        System.out.println("2 – Pizza de Mussarela (R$ 38,00)");
        System.out.println("3 – Pizza de Frango (R$ 42,00)");
        System.out.println("4 – Refrigerante (R$ 8,00)");
        System.out.println("5 – Suco (R$ 10,00)");
        System.out.print("Escolha uma opção: ");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você escolheu Pizza de Calabresa - R$ 40,00");
                break;
            case 2:
                System.out.println("Você escolheu Pizza de Mussarela - R$ 38,00");
                break;
            case 3:
                System.out.println("Você escolheu Pizza de Frango - R$ 42,00");
                break;
            case 4:
                System.out.println("Você escolheu Refrigerante - R$ 8,00");
                break;
            case 5:
                System.out.println("Você escolheu Suco - R$ 10,00");
                break;
            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}
