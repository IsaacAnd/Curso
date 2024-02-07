import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        int escolha = -1;
        do {
            String num1 = JOptionPane.showInputDialog("Digite o primeiro número");
            if (num1 == null ) {
                num1 = "0";
            }
            String num2 = JOptionPane.showInputDialog("Digite o segundo número");
            if (num2 == null) {
                num2 = "0";
            }
            int NumI1 = Integer.parseInt(num1);
            int NumI2 = Integer.parseInt(num2);
            int sum = NumI1 + NumI2;
            String sum2 = String.valueOf(sum);
            String[] options = {"Parar", "Voltar"};
            JOptionPane.showMessageDialog(null, sum2);
            escolha = JOptionPane.showOptionDialog
                    (null, "Selecione uma opção",
                            "Deseja voltar ao início?", 0, 3,
                            null, options, options[0]);

        } while (escolha != 0);
    }
}