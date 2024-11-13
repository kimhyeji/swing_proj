import javax.swing.*;

public class SwExam extends JFrame {
    public SwExam() {
        setTitle("스윙 프로젝트 연습"); // 프레임 제목 설정

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램 종료
        setSize(500, 300); // 프레임 크기 설정
        setLocationRelativeTo(null); // 화면 중앙에서 시작

        setVisible(true); // 화면에 프레임 출력

    }

    public static void main(String[] args) {
        SwExam se = new SwExam();
    }
}
