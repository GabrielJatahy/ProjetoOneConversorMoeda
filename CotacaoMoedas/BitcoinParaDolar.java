public class BitcoinParaDolar {
    private double cotacaoMoeda =0.00004;

    public double getBitcoinParaMoeda (double valorInserido) {
        return (cotacaoMoeda * valorInserido);
    }
}
