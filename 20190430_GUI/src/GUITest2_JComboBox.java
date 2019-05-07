import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUITest2_JComboBox {

	public static void main(String[] args) {
		JFrame frame = new JFrame("창이름");
		frame.setLocation(500,300);
		frame.setPreferredSize(new Dimension(300,200));

		JPanel panel = new JPanel();
		String[] picnics = {"불꽃구경", "여름수영"};
		JComboBox<String> cb =  new JComboBox<>(picnics);
		cb.addItem("가을캠프");
		
		panel.add(cb);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
