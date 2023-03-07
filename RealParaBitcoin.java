public class RealParaBitcoin {

    private double cotacaoMoeda = 114.552;

    public double getRealParaBitcoin (double valorInserido) {
        return (cotacaoMoeda * valorInserido);
    }
}
