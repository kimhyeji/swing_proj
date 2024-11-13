import javax.swing.*;
import java.awt.*;

public class SwExam extends JFrame {
    public SwExam() {
        // Frame
        setTitle("스윙 프로젝트 연습"); // 프레임 제목 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램 종료
        setSize(500, 300); // 프레임 크기 설정
        setLocationRelativeTo(null); // 화면 중앙에서 시작

        // ContentPane
        Container cp = getContentPane(); // 프레임에서 컨텐트 팬 받아오기

        // Layout
//        cp.setLayout(null);
        cp.setLayout(new FlowLayout()); // 왼쪽에서 오른쪽으로 정렬

        // JLabel
        JLabel jLabel = new JLabel("Label Test");
        jLabel.setBounds(100, 100, 100, 10);
        cp.add(jLabel);

        // JButton
        JButton jButton = new JButton("Button Test");
        jButton.setBounds(130, 130, 100, 20);
        cp.add(jButton);

        // JTextField
        JTextField jTextField = new JTextField();
        jTextField.setBounds(200, 200, 200, 30);
        jTextField.setColumns(10); // 텍트 필드 기본 입력문자 개수
        cp.add(jTextField);

        // JCheckBox
        JCheckBox lion = new JCheckBox("사자");
        JCheckBox rabbit = new JCheckBox("토끼", true);
        JCheckBox tiger = new JCheckBox("호랑이");

        cp.add(lion);
        cp.add(rabbit);
        cp.add(tiger);

        // JRadioButton
        JLabel colorLabel = new JLabel("색상을 선택해주세요 : ");
        cp.add(colorLabel);

        ButtonGroup group = new ButtonGroup(); // 그룹으로 묶을 시 하나만 선택 가능
        JRadioButton red = new JRadioButton("Red");
        JRadioButton orange = new JRadioButton("orange");
        JRadioButton yellow = new JRadioButton("yellow", true);

        group.add(red);
        group.add(orange);
        group.add(yellow);

        cp.add(red);
        cp.add(orange);
        cp.add(yellow);

        // JComboBox
        String[] colors = {"red", "orange", "yellow", "green", "blue", "navy", "purple", "olive"};
        String[] animals = {"Lion", "Tiger", "Elephant", "Panda", "Zebra"};

        JComboBox colorCombo = new JComboBox(colors);
        JComboBox animalCombo = new JComboBox(animals);

        cp.add(colorCombo);
        cp.add(animalCombo);

        // JList
        String[] fruits = {"Apple", "Banana", "Cherry", "Mango", "Melon", "Strawberry"};

        JList<String> strFList = new JList<>(fruits);
        JList fList = new JList(fruits);

        cp.add(new JScrollPane(strFList)); // 스크롤 기능 추가
        cp.add(fList);

        setVisible(true); // 화면에 프레임 출력

    }

    public static void main(String[] args) {
        SwExam se = new SwExam();
    }
}
