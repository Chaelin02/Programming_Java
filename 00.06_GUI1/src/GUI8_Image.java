import javax.swing.*;
import java.awt.*;

public class GUI8_Image {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

       ImageIcon iiPng = new ImageIcon(GUI8_Image.class.getResource("고양이.jpg"));
        ImageIcon lbII_edit = new ImageIcon(
                iiPng.getImage().getScaledInstance(iiPng.getIconWidth()/10, iiPng.getIconHeight()/10, Image.SCALE_DEFAULT));
        JLabel lbII = new JLabel(lbII_edit);

        ImageIcon iiJPg = new ImageIcon(GUI8_Image.class.getResource("유튜브.jpg"));
        ImageIcon lbII_edit2 = new ImageIcon(
                iiJPg.getImage().getScaledInstance(iiJPg.getIconWidth()/5, iiJPg.getIconHeight()/5, Image.SCALE_DEFAULT));
        JLabel lbI = new JLabel(lbII_edit2);

        panel.add(lbII);
        panel.add(lbI);

        frame.add(panel);

        frame.setPreferredSize(new Dimension(600, 400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
