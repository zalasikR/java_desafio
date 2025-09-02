package exercicio7_8;

public class Funcionario {
    private String nome;
    private String sobrenome;
    private String funcao;
    private double salario;
    private double gratificacao;
    private double desconto;

    public Funcionario(String nome, String sobrenome, String funcao, double salario, double gratificacao, double desconto) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.funcao = funcao;
        this.salario = salario;
        this.gratificacao = gratificacao;
        this.desconto = desconto;
    }

    public void aplicarAumento(double percentual) {
        this.salario += this.salario * (percentual / 100);
    }

    public double calcularSalarioFinal() {
        return salario + gratificacao - desconto;
    }

    public void exibirRelatorio() {
        System.out.println("=== RELATÓRIO FUNCIONÁRIO ===");
        System.out.println("Nome: " + nome + " " + sobrenome);
        System.out.println("Função: " + funcao);
        System.out.printf("Salário ajustado: R$ %.2f%n", salario);
        System.out.printf("Gratificação: R$ %.2f%n", gratificacao);
        System.out.printf("Desconto: R$ %.2f%n", desconto);
        System.out.printf("Salário final: R$ %.2f%n", calcularSalarioFinal());
    }
}
