import javax.swing.*;
import java.awt.*;


public class LabelFrame extends JFrame {
    private JLabel label;
    public LabelFrame() {
        super("IFMT");
        setLayout(new FlowLayout());

        Icon logo = new ImageIcon(getClass().getResource("ifmt-logo.png"));

        label = new JLabel("INSTITUTO FEDERAL DE EDUCAÇÃO, " +
                "CIÊNCIA E TECNOLOGIA DE MATO GROSSO", logo, SwingConstants.LEFT);
        label.setToolTipText("Logo IFMT");
        add(label);
    }
}