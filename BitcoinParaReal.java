public class BitcoinParaReal {
    private double cotacaoMoeda = 0.000008;

    public double getBitcoinParaReal (double valorInserido) {
        return (cotacaoMoeda * valorInserido);

    }
}
