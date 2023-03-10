package src.main.java.io.github.gabrieljatahy;

public class EuroParaDolar {
     private double cotacaoMoeda = 0.94;

    public double getGetEuroParaDolar(double valorInserido) {
        return (cotacaoMoeda * valorInserido);
    }
}
