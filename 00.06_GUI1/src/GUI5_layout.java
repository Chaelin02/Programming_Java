import javax.swing.*;
import java.awt.*;

public class GUI5_layout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        BorderLayout bl = new BorderLayout();
        panel.setLayout(bl);
        //버튼 크게하고싶으면 그리드레이아웃 백

        JButton bt0 = new JButton("Button"+0);
        JButton bt1 = new JButton("Button"+1);
        JButton bt2 = new JButton("Button"+2);
        JButton bt3 = new JButton("Button"+3);
        JButton bt4 = new JButton("Button"+4);
        JButton bt5 = new JButton("Button"+5);
        panel.add(bt0,BorderLayout.NORTH);
        panel.add(bt1,BorderLayout.WEST);
        panel.add(bt2,BorderLayout.CENTER);
        panel.add(bt3,BorderLayout.EAST);
        panel.add(bt4,BorderLayout.SOUTH);
        panel.add(bt5,BorderLayout.NORTH);   ///한곳에 두개를 넣으면 최종으로 넣은 버튼이 들어감

        frame.add(panel);

        frame.setPreferredSize(new Dimension(600, 400));

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
