import javax.swing.*;
import java.awt.*;

public class SwExam2 extends JFrame {
    public SwExam2() {
        // Frame
        setTitle("스윙 프로젝트 연습 2"); // 프레임 제목 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램 종료
        setSize(500, 300); // 프레임 크기 설정
        setLocationRelativeTo(null); // 화면 중앙에서 시작

        // ContentPane
        Container cp = getContentPane(); // 프레임에서 컨텐트 팬 받아오기

        // Layout
        cp.setLayout(new FlowLayout()); // 왼쪽에서 오른쪽으로 정렬

        // JPanel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // 컴포넌트들을 수직(Y축 방향)으로 배치
        for ( int i = 1; i <= 30; i++ ) {
            panel.add(new JLabel("Label " + i));
        }

        // JScrollPane
        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); // 항상 스크롤바 표시

        // 프레임의 컨텐트 패널에 컴포넌트 추가
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        setVisible(true); // 화면에 프레임 출력

    }

    public static void main(String[] args) {
        SwExam2 se = new SwExam2();
    }
}
