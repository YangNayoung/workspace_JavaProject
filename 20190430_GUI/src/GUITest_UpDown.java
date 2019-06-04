import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUITest_UpDown {

	protected static int computer;

	public static void main(String[] args) {
		JFrame frame = new JFrame("업앤다운게임");
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(400,600));
	
		//JTextField, JButton
		JTextField tfInput = new JTextField(10);
		JButton btQuestion = new JButton("인가?");
		//JLabel
		JLabel lbResult = new JLabel("1~100사이 숫자 맞춰봐");
		Random random = new Random();
		int rNumber = random.nextInt(100)+1;
		ActionListener al = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//사용자 입력값 가져오자
				String input = tfInput.getText();
				int player = Integer.parseInt(input);	//String을 int로 바꿈
				//컴퓨터값이랑 비교하자
				if(rNumber<player) {
					lbResult.setText("Down");
				}
				else if(rNumber>player) {
					lbResult.setText("Up");
				}
				else{
					lbResult.setText("정답");
					computer = random.nextInt(100) + 1;
				}
				
				//결과 보여주자
			}
		};
		btQuestion.addActionListener(al);
		
		panel.add(tfInput);
		panel.add(btQuestion);
		panel.add(lbResult);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
