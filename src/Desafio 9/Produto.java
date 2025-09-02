package exercicio9;

public class Produto {
    private double preco;

    public Produto(double preco) {
        this.preco = preco;
    }

    public double calcularPrecoFinal() {
        if (preco > 50) {
            return preco * 0.85; // aplica 15% de desconto
        }
        return preco;
    }
}
