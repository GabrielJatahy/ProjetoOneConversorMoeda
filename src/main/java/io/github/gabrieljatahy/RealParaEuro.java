package src.main.java.io.github.gabrieljatahy;

public class RealParaEuro {

    private double cotacaoMoeda = 5.48;

    public double getRealParaEuro (double valorInserido) {
    return (valorInserido * cotacaoMoeda);
    }
}
