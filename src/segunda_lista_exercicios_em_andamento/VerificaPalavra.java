package segunda_lista_exercicios_em_andamento;
import java.util.Scanner;

public class VerificaPalavra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();


        if (palavra.length() > 20) {
            System.out.println("A palavra é muito grande.");
        } else {
            System.out.println("A palavra é pequena.");
        }

        scanner.close();
    }
}
