public class DolarParaPeso {

    private double cotacaoMoeda = 0.05;

    public  double getDolarParaPeso (double valorInserido) {
        return (cotacaoMoeda * valorInserido);
    }
}
