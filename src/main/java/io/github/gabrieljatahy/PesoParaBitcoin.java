package src.main.java.io.github.gabrieljatahy;

public class PesoParaBitcoin {
    private double cotacaoMoeda = 22.078;

    public double getPesoParaBitcoin (double valorInserido) {
        return (cotacaoMoeda * valorInserido);
    }
}
