public class BitcoinParaEuro {
    private double cotacaoMoeda = 0.00004;

    public double getBitcoinParaEuro (double valorInserido) {
        return (cotacaoMoeda * valorInserido);
    }
}
