public class RealParaDolar {

    private double cotacaoMoeda = 5.193;

    public  double getRealParaDolar(double valorInserido) {
        return (valorInserido * cotacaoMoeda);
    }
}
