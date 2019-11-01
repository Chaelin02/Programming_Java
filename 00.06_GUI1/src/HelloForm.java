import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloForm {
    private JTextField tfname;
    private JButton bthello;
    private JLabel lbTitle;
    private JLabel lbResult;
    private JPanel panel;

    public HelloForm(){
        bthello.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                lbResult.setText("Hello , "+tfname.getText());
            }
        });
    }

//디자인으로 만든 애는 Static이 아님. 글서 main에서 해주는 거임

    public static void main(String[] args) {
        JFrame frame = new JFrame("인사하기");

        frame.add(new HelloForm().panel);

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
