package src.main.java.io.github.gabrieljatahy;

public class PesoParaDolar {
    private double cotacaoMoeda = 0.005;

    public double getPesoParaDolar (double valorInserido) {
        return (cotacaoMoeda * valorInserido);
    }
        }
