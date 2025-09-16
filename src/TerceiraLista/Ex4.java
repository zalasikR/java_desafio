package TerceiraLista;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        String nome;

        System.out.println("Digite nomes (digite 'fim' para encerrar):");
        while (true) {
            nome = sc.nextLine();
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }
            contador++;
        }
        System.out.println("Quantidade de nomes digitados: " + contador);
        sc.close();
    }
}
