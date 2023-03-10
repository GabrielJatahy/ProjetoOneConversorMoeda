package src.main.java.io.github.gabrieljatahy;

public class DolarParaReal {

    private double cotacaoMoeda = 0.19;

    public double getDolarParaReal (double valorInserido) {
        return (cotacaoMoeda * valorInserido);

    }
}
