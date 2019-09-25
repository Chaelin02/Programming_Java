import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI2_Components  {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Conponents");
        JPanel panel = new JPanel();
        JLabel lb0 = new JLabel("JLabel");
        JButton bt0 = new JButton("JButton");
        JCheckBox cb0 = new JCheckBox("JCheckBox0");
        JCheckBox cb1 = new JCheckBox("JCheckBox1");
        JRadioButton rb0 = new JRadioButton("미성년자");
        JRadioButton rb1 = new JRadioButton("성인");
        ButtonGroup bg = new ButtonGroup();

//        bg.add(rb0);
//        bg.add(rb1);

        JTextField tf0 = new JTextField("JTextField");
        JTextArea ta0 = new JTextArea(2,10);

        String[] fruits={"apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry"};
        JComboBox cbox= new JComboBox(fruits);
        cbox.addItem("바나나");


JLabel lblResult = new JLabel("Result");

        rb0.setSelected(true);    //기본값이 true여서 체크가 되어있음
        cb1.setSelected(true);
        tf0.setText("전화번호를 입력하세요");

       tf0.addFocusListener(new FocusListener() {    //나에게 집중되었을때. 내가 선택되었을땨,
           @Override
           public void focusGained(FocusEvent focusEvent) {     //관심받기
               if(tf0.getText().equals("전화번호를 입력하세요")){
                   tf0.setText("");
               }
           }

           @Override
           public void focusLost(FocusEvent focusEvent) {      //포커스가 다른곳에 있을 때
               if(tf0.getText().equals("")){
                 tf0.setText("전화번호를 입력하세요");

               }
           }
       });

        bt0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                showResult(lb0, bt0, cb0, cb1, rb0, rb1, tf0, ta0, cbox, lblResult);


            }
        });


        ItemListener il = new ItemListener() {   //cb0,cb1중 아무나 선택이 되면 여기il 로 들여와랴ㅏㅣ
            @Override
            public void itemStateChanged(ItemEvent e) {    //아이템이 눌리면 무조건 여기로 와라. 그다음에 얘가 알아서 판단함
                showResult(lb0, bt0, cb0, cb1, rb0, rb1, tf0, ta0, cbox, lblResult);
                //console 에는 표시가되ㅣ는데 Lable에는표시가 안되서 Method함수로 만들어서 호출함
                //왜? 중복된 코드를 만들고 싶지 않아성


//                if(e.getSource() == cb0 ){
//                    System.out.println("JCheckbox0 : "+cb0.isSelected());
//                }else if(e.getSource() == cb1){
//                    System.out.println("JCheckbox1 : "+cb1.isSelected());
//                }else if(e.getSource() == rb0){
//                    System.out.println("미성년자 : "+rb0.isSelected());
//                }else if(e.getSource() == rb1){
//                    System.out.println("성인 : "+rb1.isSelected());
//                }else if(e.getSource() == cbox){
//                    System.out.println(cbox.getSelectedItem());
//                }
            }
        };
    cb0.addItemListener(il);
    cb1.addItemListener(il);
    rb0.addItemListener(il);
    rb1.addItemListener(il);
    cbox.addItemListener(il);

        panel.add(lb0);
        panel.add(bt0);
        panel.add(cb0);
        panel.add(cb1);
        panel.add(rb0);
        panel.add(rb1);
        panel.add(tf0);
        panel.add(ta0);
        panel.add(cbox);
        panel.add(lblResult);

        frame.add(panel);

        frame.setPreferredSize(new Dimension(600, 400));

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private static void showResult(JLabel lb0, JButton bt0, JCheckBox cb0, JCheckBox cb1, JRadioButton rb0, JRadioButton rb1, JTextField tf0, JTextArea ta0, JComboBox cbox, JLabel lblResult) {
        String result = "";
        result += lb0.getText();
        result += bt0.getText();
        result += cb0.isSelected();
        result += cb1.isSelected();
        result += rb0.isSelected();
        result += rb1.isSelected();
        result += tf0.getText();
        result += ta0.getText();
        result += cbox.getSelectedIndex();
        result += cbox.getSelectedItem();
        lblResult.setText(result);
    }
}
