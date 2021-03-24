import javax.swing.*;
import java.awt.*;

public class MyWindowApp extends JFrame {
    private JLabel label;
    private JButton button;
    private JTextField textField;
    MyWindowApp() {
        super("MyGUI");
        label = new JLabel("типа надпись");
        textField = new JTextField("бла бла");
        button = new JButton("нажми");
//        JPanel jPanel = new JPanel(new FlowLayout());
        add(label, BorderLayout.NORTH);
        add(textField);
        add(button);
    }

}
