public class PesoParaReal {
    private double cotacaoMoeda = 0.19;

    public double getPesoParaReal (double valorInserido) {
        return (cotacaoMoeda * valorInserido);
    }
}
