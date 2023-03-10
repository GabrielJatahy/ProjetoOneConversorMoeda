package src.main.java.io.github.gabrieljatahy;

public class BitcoinParaDolar {
    private double cotacaoMoeda =0.00004;

    public double getBitcoinParaDolar (double valorInserido) {
        return (cotacaoMoeda * valorInserido);
    }
}
