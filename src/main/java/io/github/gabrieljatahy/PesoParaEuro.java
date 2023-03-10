package src.main.java.io.github.gabrieljatahy;

public class PesoParaEuro {
    private double cotacaoMoeda = 1.05;

    public double getPesoParaEuro (double valorInserido) {
        return (cotacaoMoeda * valorInserido);
    }
}
