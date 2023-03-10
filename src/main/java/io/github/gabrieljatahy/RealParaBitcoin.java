package src.main.java.io.github.gabrieljatahy;

public class RealParaBitcoin {

    private double cotacaoMoeda = 114.552;

    public double getRealParaBitcoin (double valorInserido) {
        return (cotacaoMoeda * valorInserido);
    }
}
