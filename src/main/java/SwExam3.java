import javax.swing.*;
import java.awt.*;

public class SwExam3 extends JFrame {
    public SwExam3() {
        // Frame
        setTitle("스윙 프로젝트 연습 3"); // 프레임 제목 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램 종료
        setSize(500, 500); // 프레임 크기 설정
        setLocationRelativeTo(null); // 화면 중앙에서 시작

        // ContentPane
        Container cp = getContentPane(); // 프레임에서 컨텐트 팬 받아오기

        // Layout
        cp.setLayout(new FlowLayout()); // 왼쪽에서 오른쪽으로 정렬

        // JSlider
        JSlider slider = new JSlider(0, 100, 50); // 최소값 0, 최대값 100, 초기값 50인 슬라이더 생성
        slider.setMajorTickSpacing(20); // 주요 눈금 간격 설정
        slider.setMinorTickSpacing(5); // 부수 눈금 간격 설정
        slider.setPaintTicks(true); // 눈금 표시 설정
        slider.setPaintLabels(true); // 눈금 레이블 표시 설정

        getContentPane().add(slider, BorderLayout.CENTER);
        cp.setVisible(true);

        // JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();
        JPanel tab1 = new JPanel(new BorderLayout()); // 첫 번째 탭 패널 생성
        JPanel tab2 = new JPanel();
        JPanel tab3 = new JPanel();

        tab1.add(new JLabel("첫 번째 탭", JLabel.CENTER), BorderLayout.CENTER); // 중앙에 추가
        tab2.add(new JLabel("두 번째 탭"));
        tab3.add(new JLabel("세 번째 탭"));

        tabbedPane.addTab("Tab 1", tab1);
        tabbedPane.addTab("Tab 2", tab2);
        tabbedPane.addTab("Tab 3", tab3);

        tabbedPane.setPreferredSize(new Dimension(400, 300)); // 탭 패널 기본 크기 설정
        getContentPane().add(tabbedPane, BorderLayout.CENTER);
        cp.setVisible(true);


        setVisible(true); // 화면에 프레임 출력

    }

    public static void main(String[] args) {
        SwExam3 se = new SwExam3();
    }
}
