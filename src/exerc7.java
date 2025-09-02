import java.util.Scanner;

public class exerc7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Sobrenome: ");
        String sobrenome = sc.nextLine();
        System.out.print("Função: ");
        String funcao = sc.nextLine();

        System.out.print("Salário: ");
        double salario = sc.nextDouble();
        System.out.print("Gratificação: ");
        double gratificacao = sc.nextDouble();
        System.out.print("Desconto: ");
        double desconto = sc.nextDouble();

        double salarioFinal = salario + gratificacao - desconto;

        System.out.println("\n--- Relatório ---");
        System.out.println("Nome completo: " + nome + " " + sobrenome);
        System.out.println("Função: " + funcao);
        System.out.println("Salário: " + salario);
        System.out.println("Gratificação: " + gratificacao);
        System.out.println("Desconto: " + desconto);
        System.out.println("Salário Final: " + salarioFinal);

        sc.close();
    }
}
