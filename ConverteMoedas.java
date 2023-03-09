import javax.swing.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ConverteMoedas {

    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Digite um valor: ");
        ValidaEntrada valida = new ValidaEntrada();
        while (!valida.ValidaEntrada(entrada) && entrada !=entrada) {
            entrada = JOptionPane.showInputDialog("Digite aqui um valoe monetário: ");
            if(entrada == null) {
                break;
            }
        }

        double valorInserido = Double.parseDouble(entrada);

        double valorConvertido = 0;

        NumberFormat valorFormatado = new DecimalFormat("#0.00");
        String finalMensagem = "";
        //Ordem das opcoes:"1-Real para Dolar", "2-Real para Euro", "3-Real para Peso", "4-Real Para Bitcoin", "5-Dolar para Real", "6-Dolar para Euro", "7-Dolar para Peso", "8-Dolar para Bitcoin", "9-Euro para Dolar", "10-Euro para Real", "11-Euro para Peso", "12-Euro para Bitcoin", "13-Peso Para Dolar", "14-Peso para Euro", "15-Peso para real", "16-Peso para Bitcoin", "17-Bitcoin para dolar", "18-Bitcoin para Euro", "19-Bitcoin para Peso", "20-Bitcoin para Real".
        String[] opcoes = {"Real para Dolar", "Real para Euro", "Real para Peso", "Real Para Bitcoin", "Dolar para Real", "Dolar para Euro", "Dolar para Peso", "Dolar para Bitcoin", "Euro para Dolar", "Euro para Real", "Euro para Peso", "Euro para Bitcoin", "Peso Para Dolar", "Peso para Euro", "Peso para real", "Peso para Bitcoin", "Bitcoin para dolar", "Bitcoin para Euro", "Bitcoin para Peso", "Bitcoin para Real"};

        String escolhido = (String) JOptionPane.showInputDialog(null, "Qual moeda você deseja converter", "Moedas", -1, null, opcoes, args );


        switch (escolhido) {
            case "Real para Dolar":

                System.out.println("Opção 1: " + valorInserido);
                RealParaDolar valorRealDolar = new RealParaDolar();
                valorConvertido = valorRealDolar.getRealParaDolar(valorInserido);
                finalMensagem = "O valor convertido é de: " + valorFormatado.format(valorConvertido);

                break;

            case "Real para Euro":

                System.out.println("Opção 2: " + valorInserido);
                RealParaEuro valorRealEuro = new RealParaEuro();
                valorConvertido = valorRealEuro.getRealParaEuro(valorInserido);
                finalMensagem = "O valor convertido é de: " + valorFormatado.format(valorConvertido);

                break;

            case "Real para Peso":

                System.out.println("Opção 3: " + valorInserido);
                RealParaPeso valorRealPeso = new RealParaPeso();
                valorConvertido = valorRealPeso.getRealParaPeso(valorInserido);
                finalMensagem = "O valor convertido é de: " + valorFormatado.format(valorConvertido);

                break;

            case "Real para Bitcoin":

                System.out.println("Opção 4: " + valorInserido);
                RealParaBitcoin valorRealBitcoin = new RealParaBitcoin();
                valorConvertido = valorRealBitcoin.getRealParaBitcoin(valorInserido);
                finalMensagem = "O valor convertido é de: " + valorFormatado.format(valorConvertido);

                break;

            case "Dolar para Real":

                System.out.println("Opção 5: " + valorInserido);
                DolarParaReal valorDolarReal = new DolarParaReal();
                valorConvertido = valorDolarReal.getDolarParaReal(valorInserido);
                finalMensagem = "O valor Convertido é de: " + valorFormatado.format(valorConvertido);

                break;

            case "Dolar para Euro":

                System.out.println(valorInserido);
                DolarParaEuro valorDolarEuro = new DolarParaEuro();
                valorConvertido = valorDolarEuro.getDolarParaEuro(valorInserido);
                finalMensagem = "O valor convertido é de: " + valorConvertido;

                break;

            case "Dolar para Peso":

                System.out.println(valorInserido);
                DolarParaPeso valorDolarPeso = new DolarParaPeso();
                valorConvertido = valorDolarPeso.getDolarParaPeso(valorInserido);
                finalMensagem = "O valor convertido é de: " + valorConvertido;

                break;

            case "Dolar para Bitcoin":

                System.out.println(valorInserido);
                DolarParaBitcoin valorDolarBitcoin = new DolarParaBitcoin();
                valorConvertido = valorDolarBitcoin.DolarParaBitcoin(valorInserido);
                finalMensagem = "O valor convertido é de: " + valorConvertido;

                break;
            case "Euro para Dolar":

                System.out.println(valorInserido);
                EuroParaDolar valorEuroDolar = new EuroParaDolar();
                valorConvertido = valorEuroDolar.getGetEuroParaDolar(valorInserido);
                finalMensagem = "O valor convertido é de: " + valorConvertido;

                break;

            case "Euro para Real":

                System.out.println(valorInserido);
                EuroParaReal valorEuroReal = new EuroParaReal();
                valorConvertido = valorEuroReal.getEuroParaReal(valorInserido);
                finalMensagem = "O valor convertido é de: " + valorConvertido;

                break;

            case "Euro para Peso":

                System.out.println(valorInserido);
                EuroParaPeso valorEuroPeso = new EuroParaPeso();
                valorConvertido = valorEuroPeso.getEuroParaPeso(valorInserido);
                finalMensagem = "O valor convertido é de: " + valorConvertido;

                break;

            case "Euro para Bitcoin":

                System.out.println(valorInserido);
                EuroParaBitcoin valorEuroBitcoin = new EuroParaBitcoin();
                valorConvertido = valorEuroBitcoin.getEuroParaBitcoin(valorInserido);
                finalMensagem = "O valor convertido é de: " + valorConvertido;

                break;

            case "Peso para Dolar":

                System.out.println(valorInserido);
                PesoParaDolar valorPesoDolar = new PesoParaDolar();
                valorConvertido = valorPesoDolar.getPesoParaDolar(valorInserido);
                finalMensagem = "O valor convertido é de: " + valorConvertido;

                break;

            case "Peso para Euro":
                System.out.println(valorInserido);
                PesoParaEuro valorPesoEuro = new PesoParaEuro();
                valorConvertido = valorPesoEuro.getPesoParaEuro(valorInserido);
                finalMensagem = "O valor convertido é de: " + valorConvertido;

                break;

            case "Peso para Real":

                System.out.println(valorInserido);
                PesoParaReal valorPesoReal = new PesoParaReal();
                valorConvertido = valorPesoReal.getPesoParaReal(valorInserido);
                finalMensagem = "O valor convertido é de: " + valorConvertido;

                break;

            case "Peso para Bitcoin":

                System.out.println(valorInserido);
                PesoParaBitcoin valorPesoBitCoin = new PesoParaBitcoin();
                valorConvertido = valorPesoBitCoin.getPesoParaBitcoin(valorInserido);
                finalMensagem =  "O valor Convertido é de: " + valorConvertido;

                break;

            case "Bitcoin para Dolar":
                System.out.println(valorInserido);
                BitcoinParaDolar valorBitcoinDolar = new BitcoinParaDolar();
                valorConvertido = valorBitcoinDolar.getBitcoinParaDolar(valorInserido);
                finalMensagem = "Valor Convertido é de: " + valorConvertido;

                break;

            case "Bitcoin para Euro":
                System.out.println(valorInserido);
                BitcoinParaEuro valorBitcoinEuro = new BitcoinParaEuro();
                valorConvertido = valorBitcoinEuro.getBitcoinParaEuro(valorInserido);
                finalMensagem = "O valor convertido é de: " + valorConvertido;

                break;

            case "Bitcoin para Peso":
                System.out.println(valorInserido);
                BitcoinParaPeso valorBitcoinPeso = new BitcoinParaPeso();
                valorConvertido = valorBitcoinPeso.getBitcoinParaPeso(valorInserido);
                finalMensagem = "O valor convertido é de: " + valorConvertido;

                break;

            case "Bitcoin para Real":
                System.out.println(valorInserido);
                BitcoinParaReal valorBitcoinReal = new BitcoinParaReal();
                valorConvertido = valorBitcoinReal.getBitcoinParaReal(valorInserido);
                finalMensagem = "O valor convertido é de: " + valorConvertido;

                break;






        }
        JOptionPane.showMessageDialog(null, finalMensagem);
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja inserir outro valor?");
        if (resposta == JOptionPane.YES_OPTION) {

            main(args);
        }

        JOptionPane.showMessageDialog(null, "Até a proxima!");

    }

}
