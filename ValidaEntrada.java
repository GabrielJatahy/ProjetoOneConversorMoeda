public class ValidaEntrada {

    public boolean ValidaEntrada(String entrada) {
        try {
            Double.parseDouble(entrada);
            return true;
            } catch (Exception e) {
            return false;
        }
    }
}
