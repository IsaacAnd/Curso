import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Tela extends JFrame {
    private JTextField tfChocolate, tfCookie, tfPudim;
    private JButton btnPedir;
    private JLabel pcChocolate, pcCookie, pcPudim, tilChocolate, tilCookie, tilPudim;
    private ImageIcon icon;
    double total = 0.0;



    public Tela() {
        super("Loja de Doces");
        JPanel painel = new JPanel(null);

        icon = new ImageIcon(getClass().getResource("imgs/brigadeiro.jpg"));
        JLabel label = new JLabel(icon);
        label.setBounds(5,5,128,128);
        painel.add(label);

        icon = new ImageIcon(getClass().getResource("imgs/cookie.jpg"));
        label = new JLabel(icon);
        label.setBounds(5,138,128,128);
        painel.add(label);

        icon = new ImageIcon(getClass().getResource("imgs/pudim.jpg"));
        label = new JLabel(icon);
        label.setBounds(5,271,128,128);
        painel.add(label);

        Font fonte = new Font("Times New Roman", 1, 15);

        tilChocolate = new JLabel("Brigadeiro de chocolate");
        tilChocolate.setFont(fonte);
        tilChocolate.setBounds(167,5,160,20);

        pcChocolate = new JLabel("R$ 10,00");
        pcChocolate.setBounds(170,56,50,20);

        tfChocolate = new JTextField(6);
        tfChocolate.setBounds(250,56,50,20);


        tilCookie = new JLabel("Cookie de chocolate");
        tilCookie.setFont(fonte);
        tilCookie.setBounds(167,138,160,20);

        pcCookie = new JLabel("R$ 15,00");
        pcCookie.setBounds(170,189,50,20);

        tfCookie = new JTextField(6);
        tfCookie.setBounds(250,189,50,20);


        tilPudim = new JLabel("Pudim de leite condensado");
        tilPudim.setFont(fonte);
        tilPudim.setBounds(167,271,180,20);

        pcPudim = new JLabel("R$ 25,00");
        pcPudim.setBounds(170,322,50,20);

        tfPudim = new JTextField(6);
        tfPudim.setBounds(250,322,50,20);


        btnPedir = new JButton("Pedir");
        btnPedir.setBounds(140,450,100,25);

        painel.add(tilChocolate);
        painel.add(tilCookie);
        painel.add(tilPudim);

        painel.add(pcChocolate);
        painel.add(pcCookie);
        painel.add(pcPudim);

        painel.add(tfChocolate);
        painel.add(tfCookie);
        painel.add(tfPudim);

        painel.add(btnPedir);
        add(painel);


        PedirHandler handler = new PedirHandler();
        btnPedir.addActionListener(handler);
    }
    private class PedirHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if(event.getSource() == btnPedir) {
                total = 0.0;
                try {
                    total += (Float.parseFloat(tfChocolate.getText()) * 10.00);
                } catch (NumberFormatException e) {
                    total += 0;
                }
                try {
                    total += (Float.parseFloat(tfCookie.getText()) * 15.00);
                } catch (NumberFormatException e) {
                    total += 0;
                }
                try {
                    total += (Float.parseFloat(tfPudim.getText()) * 25.00);
                } catch (NumberFormatException e) {
                    total += 0;
                }

                icon = new ImageIcon(getClass().getResource("imgs/icon.png"));

                JOptionPane.showMessageDialog(
                        null,
                        "Total da compra: " + total,
                        "Compra realizada",
                        JOptionPane.INFORMATION_MESSAGE,
                        icon
                );
                dispose();
            }
        }
    }
}
