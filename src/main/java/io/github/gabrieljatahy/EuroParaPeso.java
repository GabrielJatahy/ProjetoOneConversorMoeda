package src.main.java.io.github.gabrieljatahy;

public class EuroParaPeso {
     private double cotacaoMoeda = 0.0047;

     public double getEuroParaPeso (double valorInserido) {
         return (cotacaoMoeda * valorInserido);
     }
}
