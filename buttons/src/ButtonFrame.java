import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class ButtonFrame extends JFrame {
    private JButton plainJButton;
    private JButton fancyJButton;

    private JButton flecha;

    public ButtonFrame() {
        super("Testing Buttons");
        setLayout(new FlowLayout());
        plainJButton = new JButton("Nada");
        add(plainJButton);

        Icon flecha1 = new ImageIcon(getClass().getResource("flecha.png"));
        Icon flecha2 = new ImageIcon(getClass().getResource("flecha.png"));
        flecha = new JButton("Flecha", flecha1);
        flecha.setRolloverIcon(flecha2);
        add(flecha);

        Icon alvo1 = new ImageIcon(getClass().getResource("alvo.png"));
        Icon alvo2 = new ImageIcon(getClass().getResource("alvo.png"));
        fancyJButton = new JButton("Alvo", alvo1);
        fancyJButton.setRolloverIcon(alvo2);
        add(fancyJButton);


        ButtonHandler handler = new ButtonHandler();
        fancyJButton.addActionListener(handler);
        plainJButton.addActionListener(handler);
        flecha.addActionListener(handler);


    }
    private class ButtonHandler implements ActionListener {
        public void actionPerformed (ActionEvent event){
             JOptionPane.showMessageDialog(ButtonFrame.this, String.format ("You pressed: %s", event.getActionCommand()));
        }
    }
}