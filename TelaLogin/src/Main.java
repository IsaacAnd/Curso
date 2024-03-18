import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Tela login = new Tela();
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.setSize(400, 520);
        login.setVisible(true);
        login.setResizable(true);
        login.setLocationRelativeTo(null);
    }
}