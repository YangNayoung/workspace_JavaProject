package images;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI_가위바위보 {
	static String[] filename = {"src/images/scissors.png","src/images/rock.png","src/images/paper.png"};
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("가위바위보 게임");
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(500, 500));
		
		//Component 만들기
		JLabel result = new JLabel("Win");
		ImageIcon computerImage = new ImageIcon(filename[1]);
		JLabel computerLabel = new JLabel(computerImage); // 컴퓨터 패와 그림
		
		ImageIcon scissorsImage = new ImageIcon(filename[0]); 
		JButton scissorsButton = new JButton(scissorsImage); // 가위 버튼
		ImageIcon rockImage = new ImageIcon(filename[1]); // 바위 버튼
		JButton rockButton = new JButton(rockImage);
		ImageIcon paperImage = new ImageIcon(filename[2]); // 보 버튼
		JButton paperButton = new JButton(paperImage);
		
		panel.add(result);
		panel.add(computerLabel);
		panel.add(scissorsButton);
		panel.add(rockButton);
		panel.add(paperButton);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}