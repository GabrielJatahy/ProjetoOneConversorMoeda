public class DolarParaEuro {
    private double cotacaoMoeda = 1.05;

    public double getDolarParaEuro (double valorInserido) {
        return (cotacaoMoeda * valorInserido);
    }
}
