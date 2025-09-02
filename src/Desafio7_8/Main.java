package exercicio7_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o nome do funcionário: ");
        String nome = sc.nextLine();

        System.out.print("Informe o sobrenome: ");
        String sobrenome = sc.nextLine();

        System.out.print("Informe a função: ");
        String funcao = sc.nextLine();

        System.out.print("Informe o salário base: ");
        double salario = sc.nextDouble();

        System.out.print("Informe a gratificação: ");
        double gratificacao = sc.nextDouble();

        System.out.print("Informe o desconto: ");
        double desconto = sc.nextDouble();

        Funcionario f = new Funcionario(nome, sobrenome, funcao, salario, gratificacao, desconto);

        System.out.print("Informe o percentual de aumento do salário: ");
        double aumento = sc.nextDouble();
        f.aplicarAumento(aumento);

        f.exibirRelatorio();

        sc.close();
    }
}
