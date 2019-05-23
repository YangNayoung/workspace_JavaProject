import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI_Layout {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("√¢¿Ã∏ß");
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(500, 500));
		
		FlowLayout f1 =  new FlowLayout();
		f1.setAlignment(FlowLayout.LEFT);
		panel.setLayout(f1);
		
		for(int i=0; i<10; i++) {
			JButton bts = new JButton("Button "+ i);
			panel.add(bts);
		}
		
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
