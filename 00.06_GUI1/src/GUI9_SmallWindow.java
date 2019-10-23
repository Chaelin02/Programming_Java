import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI9_SmallWindow {
        public static void main(String[] args) {
            JFrame frame = new JFrame();
            JPanel panel = new JPanel();
            JButton bt0 = new JButton("작은 창 1");
            JButton bt1 = new JButton("작은 창 2");

            JDialog dialog = new JDialog(frame,"다이얼로그",true);     //modal내 창이 꺼지지않으면 다른창이 활성화 되지 않음.
            JLabel lb = new JLabel("레이블");
            dialog.add(lb);
            dialog.setSize(new Dimension(100,200));


            bt0.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
//              첫번째
//                JOptionPane.showMessageDialog(
//                        frame,"메시지","제목",JOptionPane.INFORMATION_MESSAGE);
//              두번째 방법
//                    int select = JOptionPane.showConfirmDialog(
//                            null,"저장할까요>?");
//                    System.out.println(select);
                    JOptionPane.showInputDialog(
                            frame,"너의 행운의 번호는?"
                    );
                }
            });

            bt1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    dialog.setVisible(true);     //프레인 띄우는 줄
                }
            });



            frame.add(panel);
            panel.add(bt0);
            panel.add(bt1);


            frame.setPreferredSize(new Dimension(600, 400));
            frame.pack();
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
}
