import java.util.Scanner;

public class idade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe sua idade: ");
        int idade = sc.nextInt();


        if (idade < 12) {
            System.out.println("Criança");
        } else if (idade <= 17) {
            System.out.println("Adolescente");
        } else if (idade <= 59) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }

        if (idade < 16) {
            System.out.println("Situação do voto: Não pode votar.");
        } else if (idade < 18 || idade > 70) {
            System.out.println("Situação do voto: Voto opcional.");
        } else {
            System.out.println("Situação do voto: Voto obrigatório.");
        }

        sc.close();
    }
}
