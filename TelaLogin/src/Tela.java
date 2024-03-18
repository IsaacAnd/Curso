import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;

public class Tela extends JFrame {

    JTextField campo_nome;
    JPasswordField campo_senha;
    JButton botao_finalizar;
    String nome = "";
    String senha;
    ImageIcon icon;
    public Tela(){
        super("Tela de login");
        JPanel painel = new JPanel(null);

        icon = new ImageIcon(getClass().getResource("logo.png"));
        JLabel label = new JLabel(icon);
        label.setBounds(SwingConstants.CENTER+100,30,196,204);

        JLabel texto_nome = new JLabel("Nome");
        texto_nome.setBounds(175,255,60,30);

        campo_nome = new JTextField(21);
        campo_nome.setBounds(95,285,200,25);

        JLabel texto_senha = new JLabel("Senha");
        texto_senha.setBounds(175,320,60,30);

        campo_senha = new JPasswordField(21);
        campo_senha.setBounds(95,350,200,25);

        botao_finalizar = new JButton("Finalizar");
        botao_finalizar.setBounds(135,410,120,30);

        painel.add(label);
        painel.add(texto_nome);
        painel.add(campo_nome);
        painel.add(texto_senha);
        painel.add(campo_senha);
        painel.add(botao_finalizar);
        add(painel);

        buttonHandler handler = new buttonHandler();
        campo_nome.addActionListener(handler);
        campo_senha.addActionListener(handler);
        botao_finalizar.addActionListener(handler);
    }
    private class buttonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == botao_finalizar) {
                nome = campo_nome.getText();
                senha = new String(campo_senha.getPassword());

                Image image = icon.getImage();
                Image newimg = image.getScaledInstance(64, 64,  java.awt.Image.SCALE_SMOOTH);
                ImageIcon icon2 = new ImageIcon(newimg);

                JOptionPane.showMessageDialog(
                        null,
                        "Nome: " + nome + "\nSenha: " + senha,
                        "Login realizado",
                        JOptionPane.INFORMATION_MESSAGE,
                        icon2
                );
            }
        }
    }
}
