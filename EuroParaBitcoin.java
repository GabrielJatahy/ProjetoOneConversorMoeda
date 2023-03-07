public class EuroParaBitcoin {
    private double cotacaoMoeda = 20.895;

    public double getEuroParaBitcoin (double valorInserido) {
        return (cotacaoMoeda * valorInserido);
    }
}
