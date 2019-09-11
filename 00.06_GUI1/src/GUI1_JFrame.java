import javax.swing.*;
import java.awt.*;

public class GUI1_JFrame {
    public static void main(String[] args) {
        //창

        JFrame frame = new JFrame("참이름");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int 화w = screenSize.width ;
        int 화h = screenSize.height ;
        int 창w = 400;
        int 창h = 200;


        frame.setPreferredSize(new Dimension(창w,창h));
        frame.setLocation((화w-창w)/2,(화h-창h)/2);

        //여러개 넣을 수 있는 주머니 ?
        JPanel panel = new JPanel();
        //글씨
        JLabel label = new JLabel("아싸 어쩌다 금요일");
        //버튼
        JButton button = new JButton("오예!");

        //창에 끼워넣기
        panel.add(label);
        panel.add(button);
        frame.add(panel);


        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}