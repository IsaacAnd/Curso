import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        Tela loja = new Tela();
        loja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loja.setSize(400, 520);
        loja.setVisible(true);
        loja.setResizable(false);
        loja.setLocationRelativeTo(null);

        loja.setIconImage(new ImageIcon(Main.class.getResource("imgs/icon.png")).getImage());

    }
}
