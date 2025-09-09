package ExerciciosAndamento;

import java.util.Scanner;

public class camiseta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==========Escolha a cor da camiseta =========");
        System.out.println("Vermelha");
        System.out.println("Azul");
        System.out.println("Verde");
        System.out.println("Preta");
        System.out.println("===========Escolha a opção acima==========");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Vermelha → R$ 30,00");
                break;
            case 2:
                System.out.println("Azul → R$ 35,00");
                break;
            case 3:
                System.out.println("Verde → R$ 40,00\n");
                break;
            case 4:
                System.out.println("Preta → R$ 50,00");
                break;

            default:
                System.out.println("opção invalida");
        }

    }
}
