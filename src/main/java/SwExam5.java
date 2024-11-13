import javax.swing.*;
import java.awt.*;
import java.io.File;

public class SwExam5 extends JFrame {
    public SwExam5() {
        // Frame
        setTitle("스윙 프로젝트 연습 5"); // 프레임 제목 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램 종료
        setSize(500, 300); // 프레임 크기 설정
        setLocationRelativeTo(null); // 화면 중앙에서 시작

        // ContentPane
        Container cp = getContentPane(); // 프레임에서 컨텐트 팬 받아오기

        // Layout
        cp.setLayout(new FlowLayout()); // 왼쪽에서 오른쪽으로 정렬

        // 버튼을 눌러 JFileChooser 표시
        JButton showFileChooserButton = new JButton("Open File Chooser");
        showFileChooserButton.addActionListener(e -> showFileChooser(this)); // 버튼 클릭 시 파일 선택기 표시

        cp.add(showFileChooserButton);

        setVisible(true); // 화면에 프레임 출력

    }

    private void showFileChooser(JFrame frame) {
        // JFileChooser
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this); // 파일 열기 대화상자 표시

        if ( result == JFileChooser.APPROVE_OPTION ) { // 파일을 선택한 경우
            File selectedFile = fileChooser.getSelectedFile(); // 선택된 파일 가져오기
            JOptionPane.showMessageDialog(this, "Selected file : " + selectedFile.getAbsolutePath());
            // 선택된 파일 경로를 메세지로 표시
        }

    }

    public static void main(String[] args) {
        SwExam5 se = new SwExam5();
    }
}
