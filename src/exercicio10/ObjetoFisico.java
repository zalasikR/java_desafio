package exercicio10;

public class ObjetoFisico {
    private double massa;     // em kg
    private double velocidade; // em m/s
    private final double g = 9.81; // gravidade

    public ObjetoFisico(double massa, double velocidade) {
        this.massa = massa;
        this.velocidade = velocidade;
    }

    public double calcularEnergiaCinetica() {
        return 0.5 * massa * Math.pow(velocidade, 2);
    }

    public double calcularAlturaEquivalente() {
        return calcularEnergiaCinetica() / (massa * g);
    }
}
