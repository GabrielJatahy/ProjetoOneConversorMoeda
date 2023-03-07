public class RealParaPeso {
    private double cotacaoMoeda = 0.26;

    public double getRealParaPeso  (double valorInserido){
        return (cotacaoMoeda * valorInserido);
    }
}
