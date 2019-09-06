import javax.swing.*;

public class GUI1_JFrame  {
    public static void main(String[] args) {
        JFrame frame = new JFrame("창이름");
        JLabel lable = new JLabel("아싸 어쩌다 금요일");

        frame.add(lable);

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //X버튼 누르면 끝ㅐㄴ네

    }
}
