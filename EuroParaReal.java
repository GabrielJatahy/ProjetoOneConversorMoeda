public class EuroParaReal {
    private double cotacaoMoeda = 0.18;

    public double getEuroParaReal (double valorInserido) {
        return (cotacaoMoeda * valorInserido);
    }
}
