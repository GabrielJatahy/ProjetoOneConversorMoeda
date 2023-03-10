package src.main.java.io.github.gabrieljatahy;

public class RealParaPeso {
    private double cotacaoMoeda = 0.26;

    public double getRealParaPeso  (double valorInserido){
        return (cotacaoMoeda * valorInserido);
    }
}
