import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUITest2_Month {

	public static void main(String[] args) {
		JFrame frame = new JFrame("창이름");
		frame.setLocation(500,300);
		frame.setPreferredSize(new Dimension(300,200));
		
		JLabel label = new JLabel("태어난 달: ");
		JPanel panel = new JPanel();
		String[] picnics = {"1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "12월"};
		JComboBox<String> cb =  new JComboBox<>(picnics);
		
		panel.add(label);
		panel.add(cb);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
