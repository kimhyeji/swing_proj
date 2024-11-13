import javax.swing.*;
import java.awt.*;

public class SwExam3 extends JFrame {
    public SwExam3() {
        // Frame
        setTitle("스윙 프로젝트 연습 3"); // 프레임 제목 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램 종료
        setSize(500, 300); // 프레임 크기 설정
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


        setVisible(true); // 화면에 프레임 출력

    }

    public static void main(String[] args) {
        SwExam3 se = new SwExam3();
    }
}
