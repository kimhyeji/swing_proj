import javax.swing.*;
import java.awt.*;

public class SwExam extends JFrame {
    public SwExam() {
        setTitle("스윙 프로젝트 연습"); // 프레임 제목 설정

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램 종료
        setSize(500, 300); // 프레임 크기 설정
        setLocationRelativeTo(null); // 화면 중앙에서 시작

        Container cp = getContentPane(); // 프레임에서 컨텐트 팬 받아오기
        cp.setLayout(null);
//        cp.setLayout(new FlowLayout()); // 왼쪽에서 오른쪽으로 정렬


        setVisible(true); // 화면에 프레임 출력

    }

    public static void main(String[] args) {
        SwExam se = new SwExam();
    }
}
