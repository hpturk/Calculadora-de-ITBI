import javax.swing.JOptionPane;

public class CalculadoraITBI {

    public static void main(String[] args) {
        // Entrada de dados usando JOptionPane
        String inputTransacao = JOptionPane.showInputDialog("Digite o valor da transação do imóvel:");
        String inputVenal = JOptionPane.showInputDialog("Digite o valor venal do imóvel:");
        String inputPorcentagemITBI = JOptionPane.showInputDialog("Digite a porcentagem do ITBI:");

        // Converter inputs para double
        double valorTransacao = Double.parseDouble(inputTransacao);
        double valorVenal = Double.parseDouble(inputVenal);
        double porcentagemITBI = Double.parseDouble(inputPorcentagemITBI);

        // Calcular ITBI com base no maior valor entre transação e venal
        double maiorValor = Math.max(valorTransacao, valorVenal);
        double itbi = maiorValor * (porcentagemITBI / 100);

        // Exibir resultado usando JOptionPane
        JOptionPane.showMessageDialog(null, String.format("O valor do ITBI a ser pago é: R$ %.2f", itbi));
    }
}
