import javax.swing.*;
import java.awt.*;

public class JFramex {
    public static void main(String[] args) {
        JFrame frame=new JFrame("JFramex");
        JPanel panel=new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label=new JLabel("JFrame by ex");
        JButton button=new JButton();
        button.setText("button");
        panel.add(label);
        panel.add(button);
        frame.add(panel);
        frame.setSize(200,500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
