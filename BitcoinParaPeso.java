public class BitcoinParaPeso {
     private double cotacaoMoeda = 0.0000002;

     public double getBitcoinParaPeso (double valorInserido) {
         return (cotacaoMoeda * valorInserido);
    }
}
