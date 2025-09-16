package TerceiraLista;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Inverter número
        System.out.print("Digite um número inteiro positivo: ");
        int numero = sc.nextInt();
        String numStr = Integer.toString(numero);
        String numInvertido = new StringBuilder(numStr).reverse().toString();
        System.out.println("Número invertido: " + numInvertido);

        sc.nextLine(); // consumir quebra de linha

        // Inverter string
        System.out.print("Digite uma palavra: ");
        String texto = sc.nextLine();
        String textoInvertido = new StringBuilder(texto).reverse().toString();
        System.out.println("String invertida: " + textoInvertido);

        sc.close();
    }
}
