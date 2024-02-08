import javax.swing.*;
import java.text.NumberFormat;
import java.util.Locale;
class SacolaDeCompras {
    private double total = 0.0;
    private String numeros = "";
    private Produto[] itens = new Produto[100];
    private int[] quants = new int[100];
    private int i2 = 0;
    NumberFormat dinheiro = NumberFormat.getCurrencyInstance(new Locale("pt","BR"));

    public void exibirOpcoes() {
        int escolha;
        boolean incremento;

        do {
            String[] sacola = {"Macarrão", "Miojo", "Extrato de Tomate", "Alface", "Batata", "Arroz", "Feijão", "Carne", "Pão"};
            Integer i = JOptionPane.showOptionDialog(null,
                    null, "Escolha um produto",
                    JOptionPane.PLAIN_MESSAGE, 1, null, sacola, 0);

            Produto produtoSelecionado = new Produto(sacola[i], obterPrecoProduto(sacola[i]));
            int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade desse produto desejado"));
            incremento = false;

            if (i2 == 0) {
                itens[i2] = produtoSelecionado;
                quants[i2] = quantidade;
                i2++;
            } else {
                for (int v = 0; v < i2; v++) {
                    if (sacola[i].equals(itens[v].getNome())) {
                        quants[v] += quantidade;
                        incremento = false;
                        break;
                    } else {
                        incremento = true;
                    }
                }

                if (incremento) {
                    itens[i2] = produtoSelecionado;
                    quants[i2] = quantidade;
                    i2++;
                }
            }

            String[] options = {"Adicionar Produto", "Terminar compra"};
            escolha = JOptionPane.showOptionDialog(
                    null, "Selecione uma opção",
                    "Deseja continuar a compra?", 0, 3,
                    null, options, options[0]);
        } while (escolha == 0);

        for (int i = 0; i < i2; i++) {
            numeros += itens[i].getNome() + " x" + quants[i] + "\n";
            total += itens[i].getPreco() * quants[i];
        }

        JOptionPane.showMessageDialog(null, numeros + "\nTotal: " + dinheiro.format(total));
    }

    private double obterPrecoProduto(String nome) {
        switch (nome) {
            case "Macarrão":
                return 2.90;
            case "Miojo":
                return 2.50;
            case "Extrato de Tomate":
                return 1.20;
            case "Alface":
                return 0.75;
            case "Batata":
                return 0.90;
            case "Arroz":
                return 3.00;
            case "Feijão":
                return 2.50;
            case "Carne":
                return 12.00;
            case "Pão":
                return 1.00;
            default:
                return 0.0;
        }
    }
}
